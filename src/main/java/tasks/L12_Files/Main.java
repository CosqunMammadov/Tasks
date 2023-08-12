package tasks.L12_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\coshq\\Desktop\\Java\\projects\\Tasks\\docs\\people info.txt");
        String str ="";
        ArrayList<Person> personList = new ArrayList<>();

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                str = str + sc.nextLine();
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String[] individuals = str.split("\\},\\s*\\{");
        for (String individual : individuals) {
            String[] fields = individual.replaceAll("\\{|\\}", "").split(",\\s*");
            String name = fields[0].split(":")[1].replaceAll("\"", "").trim();
            String surname = fields[1].split(":")[1].replaceAll("\"", "").trim();
            int age = Integer.parseInt(fields[2].split(":")[1].trim());
            String gender = fields[3].split(":")[1].replaceAll("\"", "").trim();
            String birthDate = fields[4].split(":")[1].replaceAll("\"", "").trim();
            personList.add(new Person(name, surname, age, gender, birthDate));
        }
        System.out.println(personList);

    }
}

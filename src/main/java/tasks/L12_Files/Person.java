package tasks.L12_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Person {

    String name;
    String surname;
    int age;
    String gender;
    String birthDate;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String gender, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}

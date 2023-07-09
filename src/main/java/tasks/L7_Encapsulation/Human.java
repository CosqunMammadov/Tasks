package tasks.L7_Encapsulation;

import java.util.Objects;

public class Human {
     private String name;
      private String surname;
     private int age;
     private String gender;
     private int iq;

    public void setName(String name) {
        if (name.length()<3 || name.length()>32)
            System.out.println("Name lenght can't be less than 3 and can't be greater than 32");
        else
            this.name = name;
    }

    public void setSurname(String surname) {
        if (surname.length()<3 || surname.length()>32)
            System.out.println("Surname lenght can't be less than 3 and can't be greater than 32");
        else
            this.surname = surname;
    }

    public void setAge(int age) {
        if (age<0 || age>250)
            System.out.println("Age  can't be less than 0 and can't be greater than 250");
        else
            this.age = age;
    }

    public void setGender(String gender) {
        if (Objects.equals(gender, "FEMALE") || Objects.equals(gender, "MALE"))
            this.gender = gender;
        else System.out.println("Gender should be MALE or FEMALE");
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getIq() {
        return iq;
    }


}

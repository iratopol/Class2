package com.company;

public class Girl {
    private String name;
    private int age;



    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 30) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }



    public Girl(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void goToCinema() {
        System.out.println(name+ "say OK!");
    }

    public String gpToRest(String rest)  {
        if ("Mac".equals(rest)) {
            return "No";
        } else {
            return "Yes";
        }
    }
}

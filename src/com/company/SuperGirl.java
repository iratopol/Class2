package com.company;

public class SuperGirl extends Girl {
    String superPower;



    public SuperGirl(String name, int age, String superPower) {
        super(name, age);
        this.superPower = superPower;
    }

    @Override
    public String toString() {
        return "SuperGirl{" +
                "superPower='" + superPower + '\'' +
                "} " + super.toString();
    }
}

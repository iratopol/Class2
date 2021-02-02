package com.company;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        int result = 10 > 5 ? 100 : 50;
        System.out.println("result = " + result);
        String test = "test";
        StringBuffer reverse = new StringBuffer(test).reverse();
        System.out.println(reverse);
        System.out.println(test.length());

        String strInt = "123";
        int number = Integer.parseInt(strInt);
        System.out.println(number);
        System.out.println(Integer.toString(number));
        System.out.println(number + 2);
        String[] split = strInt.split("");
        System.out.println();
        System.out.println("GIT");
        System.out.println("GIT");
        System.out.println("GIT");
        System.out.println("GIT");
        System.out.println("GIT");
        System.out.println("GIT");
        System.out.println("GIT");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream.range(1, 10)
                .filter(s -> s % 2 == 0)
                .map(s -> s * 100)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println();
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] numbers1 = {{11, 21, 31}, {41, 51, 61}, {71, 81, 91}};

        soutArray(numbers);
        soutArray(numbers1);
        for (String s : "1234".split("")) {
            int resultInt = Integer.parseInt(s);
            System.out.println(resultInt);
        }
        System.out.println();
        int sum = 0;
        int prov = 1;
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            sum += i;
            prov *= i;
        }
        System.out.println(sum);
        System.out.println(prov);
        String strNew = String.valueOf(number + 1);
        System.out.println(strNew);


        int age = 7;
        String workPlace;
        if (age <= 6) {
            System.out.println(workPlace = "Kindergarten");
        } else if (age > 6 && age < 18) {
            System.out.println(workPlace = "School");
        } else if (age >= 18 && age < 22) {
            System.out.println(workPlace = "University");
        } else if (age >= 22 && age <= 60) {
            System.out.println(workPlace = "Work");
        } else {
            System.out.println(workPlace = "Retied");
        }

        int day = 10;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Workday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("default");
        }


    }

    private static void soutArray(int[][] numbers) {
        for (int[] vagon : numbers) {
            System.out.println();
            for (int sits : vagon) {
                System.out.print(sits + " ");
            }
        }
        System.out.println();
    }


    /*public static void main(String[] args) {
        Girl ira = new Girl("Ira", 20);
        System.out.println(ira.getAge());
        ira.setAge(10000);
        System.out.println(ira.getAge());
        System.out.println(ira.getName());

        System.out.println(ira.getName());
        SuperGirl superGirl = new SuperGirl("Ira", 25, "Cook");
        superGirl.goToCinema();
        System.out.println(superGirl);
        System.out.println(superGirl.gpToRest("Starrgorod"));



        Test test = new Test(15, 20);
        int x = 10;
        int y = 10;
        test.meth(x,y);
        test.metha(test);
        System.out.println(x);
        System.out.println(y);


    }*/
}


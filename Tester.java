package com.hunger;

import java.util.Scanner;
import java.util.TreeSet;

public class Tester  {
    static String sortingOrder;
    static String sortingKey = "";

    public static void main(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MyComparator mc = new MyComparator();
        int option = 0;
        Employee emp1 = new Employee("111", "MOHAN", 30000, "GOA");
        Employee emp2 = new Employee("112", "SOHAN", 320000, "AGRA");
        Employee emp3 = new Employee("113", "ROHAN", 310000, "GOPALGUNJ");
        Employee emp4 = new Employee("115", "JAGMOHAN", 350000, "VISHAKPATNAM");
        Employee emp5 = new Employee("114", "RAMMOHAN", 330000, "ASANSOL");
        System.out.println("EMPLOYEE  SORTING APPLICATION");
        System.out.println("========================================");
        while (true) {
            System.out.println();
            System.out.println("1. Sorting By EID  ");
            System.out.println("2. Sorting By ENAME  ");
            System.out.println("3. Sorting By ESAL  ");
            System.out.println("4. Sorting By EADDR  ");
            System.out.println("5. EXIT  ");
            System.out.println("YOUR OPTION :  ");
            option = sc.nextInt();
            if(option>0 && option<=4){
                System.out.println("Sorting order[ASC/DESC]");
                sortingOrder=sc.next();
            }
            switch (option) {
                case 1:
                    sortingKey = "EID";
                    break;
                case 2:
                    sortingKey = "ENAME";
                    break;
                case 3:
                    sortingKey = "ESAL";
                    break;
                case 4:
                    sortingKey = "EADDR";
                    break;
                case 5:
                    System.out.println("****Thank u for using Sorting App****");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option,Kindly give option 1,2,3,4,5");
                    break;

            }
            TreeSet<Employee> ts = new TreeSet<Employee>(mc);
            ts.add(emp1);
            ts.add(emp3);
            ts.add(emp2);
            ts.add(emp5);
            ts.add(emp4);
            System.out.println(ts);

        }
    }
}

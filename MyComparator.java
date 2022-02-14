package com.hunger;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee>  {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int value=0;
        if(Tester.sortingKey.equalsIgnoreCase("EID")){
            value=emp1.eid.compareTo(emp2.eid);
        }
        if(Tester.sortingKey.equalsIgnoreCase("ENAME")){
            value=emp1.ename.compareTo(emp2.ename);
        }
        if(Tester.sortingKey.equalsIgnoreCase("ESAL")){
            value=(emp1.esal-emp2.esal);
        }
        if(Tester.sortingKey.equalsIgnoreCase("EADDR")){
            value=emp1.eaddr.compareTo(emp2.eaddr);
        }
        if(Tester.sortingOrder.equalsIgnoreCase("ASC")){
            return value;
        }
        else{
            return -value;
        }
    }
}

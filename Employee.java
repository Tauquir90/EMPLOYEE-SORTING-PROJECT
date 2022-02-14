package com.hunger;

public class Employee {
    String eid;
    String ename;
    int esal;
    String eaddr;
    public Employee(String eid, String ename, int esal,String eaddr)
    {
        this.eid = eid;
        this.ename = ename;
        this.esal=esal;
        this.eaddr=eaddr;
    }
    public String toString()
    {
        return "Employee[EID: "+eid+", ENAME:"+ename+
                ", ESAL:"+esal+" EADDR: "+eaddr+"]\n";
    }
}

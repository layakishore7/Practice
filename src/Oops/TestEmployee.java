package Oops;

import Oops.Employee;

public class TestEmployee {

    public static void main(String[] args) {
        Employee e= new Employee("Jhon",30000);
        System.out.println(e.getSalary());
        Employee.setHraper(25);
        System.out.println(e.getSalary());

    }
}

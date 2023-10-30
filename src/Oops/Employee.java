package Oops;

public class Employee {

    private  String name;
    private  int salary;

    private  static double hraper = 20;

    public Employee(String n, int sal){
        this.name = n;
        this.salary = sal;
    }
    public void  print(){
        System.out.println(name);
        System.out.println(salary);
    }

    public  void setSalary(int sal){
        salary = sal;
    }

    public double getSalary(){
        return this.salary + this.salary* Employee.hraper/100;
    }

    public static void setHraper(int hra){
        Employee.hraper = hra;
    }
}

package Secondprj;

public class Employee  {

    String name;
    private int age;
    private int salary;

    public Employee() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void saySalary() {
        System.out.println("My salary is: " + salary);
    }
}

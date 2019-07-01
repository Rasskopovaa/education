package Secondprj;

public class Worker extends Employee {

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age ='" + getAge() + '\'' +
                ", salary ='" + getSalary() + "рублей" + '\'' +
                '}';
    }
}

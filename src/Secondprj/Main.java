package Secondprj;

public class Main {
    public static void main(String[] args){
      Employee employee= new Employee();
      Leader leader= new Leader();
      Worker worker = new Worker();


      System.out.print("The maximal age of employees is - " + employee.getmaxAge()+".");
      System.out.println("Everyone should have a "+  employee.ed +".");
      System.out.println("The name of leader-"+ leader.name);
      worker.saySalary();
    }
}

package Secondprj;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

      Worker worker1 = new Worker(); //создаем ряд сотрудников, лучше вместо воркер использовать слово employee
      Worker worker2 = new Worker();
      Worker worker3 = new Worker();
      Worker worker4 = new Worker();

      worker1.setAge(18); //указываем возраст
      worker1.setName("Бубенчик"); //указываем имя
      worker1.setSalary(1); // указываем ЗП   (все это можно было задать если бы мы написали конструктор с параметрами.
      //задача: сделай конструкторы с параметрами и упрости этот код)

      System.out.println(worker1.toString());  // смотри метод toString()


      List<Worker> list = new ArrayList<>(); //создаем пустой список работников (тип указываем Worker
      list.add(worker1);  //добавляем воркеров в этот список
      list.add(worker2);
      list.add(worker3);
      list.add(worker4);

      Leader leader = new Leader(list); // создаем лидера через конструктор с параметром.
      System.out.println(leader.toString());  // выводим лидера через toString() омотри метод

      worker1.saySalary(); // а тут бонус. Задача понять почему по-разному отрабатывают методы для воркера и лидера.
      leader.saySalary();



    }
}

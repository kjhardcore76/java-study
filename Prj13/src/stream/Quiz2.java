package stream;

import java.util.*;

public class Quiz2 {
  public static void main(String[] args) {
    Customer customer1 = new Customer("둘리", 40, 100) ;
    Customer customer2 = new Customer("또치", 13, 50) ;
    Customer customer3 = new Customer("도우너", 25, 70) ;
    List<Customer> customers = new ArrayList<>();
    customers.add(customer1);
    customers.add(customer2);
    customers.add(customer3);
    customers.stream()
    .filter(customer -> customer.age >= 20)
    .sorted((a,b) -> a.age > b.age ? -1 : 1)
    .forEach(customer -> System.out.println(customer.name+" "+customer.age));
  }
}

class Customer{
  String name;
  Integer age;
  Integer coast;
  public Customer(String name, Integer age, Integer coast) {
    this.name = name;
    this.age = age;
    this.coast = coast;
  }
}
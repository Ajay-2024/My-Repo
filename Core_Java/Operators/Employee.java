package Operators;

public class Employee {
   int id;
   String name;
   int salary;
   String dept;

   void display() {
      System.out.println(this.id);
      System.out.println(this.name);
      System.out.println(this.salary);
      System.out.println(this.dept);
   }

   public static void main(String[] args) {
      Employee emp1 = new Employee();
      emp1.id = 101;
      emp1.name = "Ajay";
      emp1.salary = 30000;
      emp1.dept = "Quality";
      emp1.display();
   }
}

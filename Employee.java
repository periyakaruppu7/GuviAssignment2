package GuviAssignment2;

//Employee class inheriting from Person
public class Employee extends Person {
 private String employeeID;
 private double salary;

 public Employee(String name, int age, String employeeID, double salary) {
     super(name, age); // Initialize Person attributes
     this.employeeID = employeeID;
     this.salary = salary;
 }

 // Override display method
 public void display() {
     super.display();
     System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
 }

 // Main method for testing
 public static void main(String[] args) {
     System.out.println("Testing Employee Class:");
     Employee emp = new Employee("Alice", 30, "E123", 50000.0);
     emp.display();
 }
}

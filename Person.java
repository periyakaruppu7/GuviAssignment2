package GuviAssignment2;

//Person class with name and age properties
public class Person {
 private String name;
 private int age;

 // Default constructor (sets age to 18)
 public Person() {
     this.age = 18;
 }

 // Parameterized constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to display name and age
 public void display() {
     System.out.println("Name: " + name + ", Age: " + age);
 }

 // Main method for testing
 public static void main(String[] args) {
     Person p1 = new Person(); // Default constructor
     Person p2 = new Person("John", 25); // Parameterized constructor
     System.out.println("Testing Person Class:");
     p1.display();
     p2.display();
 }
}

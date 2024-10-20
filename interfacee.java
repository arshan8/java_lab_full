package popo2;



//Person.java
interface Person {
 void displayInfo();
}

//Teacher.java
class Teacher implements Person {
 private String name;
 int sal;

 public Teacher(String name, int sal) {
     this.name = name;
     this.sal = sal;
 }

 @Override
 public void displayInfo() {
     System.out.println("Teacher Name: " + name);
     System.out.println("Teacher salary: " + sal);
 }
}

//Student.java
class Student implements Person {
 private String name;

 public Student(String name) {
     this.name = name;
 }

 @Override
 public void displayInfo() {
     System.out.println("Student Name: " + name);
 }
}

//Main.java
public class interfacee {
 public static void main(String[] args) {
     Person teacher = new Teacher("Alice Johnson",70);
     Person student = new Student("John Doe");

     System.out.println("Displaying Information:");
     teacher.displayInfo();
     student.displayInfo();
 }
}

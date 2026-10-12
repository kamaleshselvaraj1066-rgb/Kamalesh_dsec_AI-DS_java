
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Branch:");
        String branch = sc.nextLine();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter Experience in Years:");
        int experience = sc.nextInt();

        System.out.println("\nEmployee Details");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience + " years");

        sc.close();
    }
}


Question 1
public class main {
   public static void main(String[] args){
     System.out.println("Hello, Java!");
     System.out.println("Welcome to Programming.");
     System.out.println("My journey starts today.");
   }
}

Question 2
import java.util.Scanner;

public class Student {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter student college: ");
    String college = sc.nextLine();

    System.out.print("Enter student department: ");
    String dept = sc.nextLine();

    System.out.print("Enter student course: ");
    String course = sc.nextLine();


    System.out.println("\nStudent Data");
    System.out.println("Student college = " + college);
    System.out.println("Student dept = " + dept);
    System.out.println("student course="+ course);

    sc.close();
}
}

Question 3
public class main {
   public static void main(String[] args){
     System.out.print("Java is simple ");
     System.out.print("Java is powerful");
   }
}

Question 4

public class main {
    public static void main(String[] args) {
        System.out.println("Name\t: Arun\nCourse\t: Java\nLevel\t: Beginner");
    }
}

Question 5

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter student grade: ");
        String grade = sc.nextLine();

        System.out.print("Enter student placement status: ");
        String placementStatus = sc.nextLine();

        System.out.println("\nStudent Data");
        System.out.println("Student name = " + name);
        System.out.println("Student age = " + age);
        System.out.println("Student grade = " + grade);
        System.out.println("Student placement status = " + placementStatus);

        sc.close();
    }
}

Question 6
public class Main {
    public static void main(String[] args) {

        long population = 8000000L;
        double productPrice = 1499.95;
        char bloodGroup = 'A';
        boolean accountVerified = true;
        String employeeName = "Kavin";

        System.out.println("Population: " + population);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Account Verified: " + accountVerified);
        System.out.println("Employee Name: " + employeeName);
    }
}

Question 7

public class Main {
    public static void main(String[] args) {

        String productName = "Laptop";
        int productID = 101;
        double price = 45000.00;
        boolean availability = true;

        System.out.println("**************************");
        System.out.println("      PRODUCT CARD       ");
        System.out.println("**************************");
        System.out.println("Product Name : " + productName);
        System.out.println("Product ID   : " + productID);
        System.out.println("Price        : Rs." + price);
        System.out.println("Availability : " + availability);
        System.out.println("**************************");
    }
}

Question 8

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        String city = sc.nextLine();

        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        sc.close();
    }
}

Question 9

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int rollNumber = sc.nextInt();
        String department = sc.next();
        double percentage = sc.nextDouble();

        System.out.println("STUDENT REGISTRATION");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
        System.out.println("Percentage: " + percentage);

        sc.close();
    }
}

Question 10

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String customer = sc.next();
        String movie = sc.next();
        int tickets = sc.nextInt();
        double ticketPrice = sc.nextDouble();

        System.out.println("BOOKING SUMMARY");
        System.out.println("Customer: " + customer);
        System.out.println("Movie: " + movie);
        System.out.println("Tickets: " + tickets);
        System.out.println("Ticket Price: " + ticketPrice);

        sc.close();
    }
}




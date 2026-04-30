import java.util.Scanner;

class Employee {
    private String employeeName;
    private double employeeSalary;

    // Method to read data
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter salary: ");
        employeeSalary = sc.nextDouble();
    }

    // Method to display data
    public void displayEmployeeData() {
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();   // object creation
        e.readEmployeeData();          // method call
        e.displayEmployeeData();       // method call
    }
}
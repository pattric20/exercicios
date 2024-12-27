package app;
import java.util.Locale;
import java.util.Scanner;

import exe_vector.*;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ListEmployees lista = new ListEmployees();
        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt(),id;
        for(int i=1;i<=N;i++){
            System.out.println();
            String name;
            float salary;
            System.out.println("Emplyoee #"+i+":");
            System.out.print("ID: ");
            id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextFloat();
            Employees emp = new Employees(id,name,salary);
            lista.addEmplyoee(emp);
        }

        System.out.println("\nEnter the employee id that will have salary increase: ");
        id = sc.nextInt();
        System.out.println("Enter the percentage: ");
        float percent = sc.nextFloat();
        lista.increaseSalary(id,percent);
        System.out.println();
        lista.printListEmployees();
    }
}
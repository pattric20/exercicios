package app;

import Class_Method_Abstract.*;
import entidades.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax players: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf("Tax payer #%d data: \n", (i+1));
            System.out.print("Individual or Company (i/c): ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anuallIncome = sc.nextDouble();
            TaxPayer taxpayer;
            if (type == 'i') {
                System.out.print("Health expenditure: ");
                double healthexpenditure = sc.nextDouble();
                taxpayer = new Individual(name,anuallIncome,healthexpenditure);
                list.add(taxpayer);
            }else if (type == 'c'){
                System.out.print("Number of employees: ");
                int numberemployees = sc.nextInt();
                taxpayer = new Company(name,anuallIncome,numberemployees);
                list.add(taxpayer);
            }
            System.out.println();
        }
        System.out.println("TAX PAID:");
        for(TaxPayer payer:list)
            System.out.println(payer.getName() + ": $" + String.format("%.2f",payer.tax()));
        sc.close();
    }
}
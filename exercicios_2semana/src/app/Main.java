package app;

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

        List<Product> list = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        System.out.println();

        for(int i=0; i<n; i++) {
            System.out.printf("Product #%d data:\n", i + 1);
            System.out.print("Common, used or imported: (c/u/i): ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            if (type == 'c'){
                list.add(new Product(pName, price));
            }else if(type == 'u'){
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(pName,price,manufactureDate));
            }else{
                System.out.print("Custom free: ");
                int customFree = sc.nextInt();
                list.add(new ImportedProduct(pName,price,customFree));
            }

            System.out.println();
        }

        for(Product product:list)
            System.out.println(product.priceTag());
        sc.close();
    }
}
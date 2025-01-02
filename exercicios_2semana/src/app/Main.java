package app;

import entidades_enumeracao_composicao.*;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth: ");
        Date birth = sdf.parse(sc.next());
        Client client = new Client(name,email,birth);

        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(),status,client);

        System.out.println("\nHow many items to this order?");
        int n = sc.nextInt();
        System.out.println();

        for(int i=0; i<n; i++) {
            System.out.printf("Enter #%d item data:\n",i+1);
            System.out.print("Product name: ");
            sc.nextLine();
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(pName, price);
            OrderItem oItem = new OrderItem(quantity, product);
            order.addItem(oItem);
            System.out.println();
        }

        System.out.println(order.toString());

        sc.close();
    }
}
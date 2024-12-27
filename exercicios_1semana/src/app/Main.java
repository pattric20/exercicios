package app;
import java.util.Locale;
import java.util.Scanner;

import exe_vector.*;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pensionato exe = new Pensionato();
        System.out.print("How many rooms will be rented? ");
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            System.out.println();
            String name, email;
            int room;
            System.out.println("Rent #"+i+":");
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            room = sc.nextInt();
            Locatario loc = new Locatario(name,email,room);
            exe.addLocatario(loc);
        }

        System.out.println("Busy rooms: ");
        for(Locatario i:exe.getBusyRooms())
            System.out.println(i.getRoom()+":  " + i.getName()+"," + i.getEmail());

    }
}
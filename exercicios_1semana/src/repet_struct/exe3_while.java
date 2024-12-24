package repet_struct;

import java.util.Scanner;

public class exe3_while {
    public exe3_while(){
        Scanner sc = new Scanner(System.in);
        String cod = sc.nextLine();
        int alcool = 0, gasolina = 0, diesel = 0;
        while (!cod.equals("4")){
            switch (cod) {
                case "1":
                    alcool++;
                    break;
                case "2":
                    gasolina++;
                    break;
                case "3":
                    diesel++;
                    break;
                default:
                    System.out.println("Código invalido digite outro: ");
                    break;
            }
            cod = sc.nextLine();
        }
        System.out.println("Muito Obrigado");
        System.out.printf("\nAlcool: %d", alcool);
        System.out.printf("\nGasolina: %d", gasolina);
        System.out.printf("\nDiesel: %d", diesel);
        sc.close();
    }
}

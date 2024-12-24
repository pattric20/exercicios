package repet_struct;

import java.util.Scanner;

public class exe2_while {
    Scanner sc = new Scanner(System.in);
    public exe2_while(){
        System.out.println("Digite as coordenadas");
        float x = sc.nextFloat(), y = sc.nextFloat();
        while(x != 0 && y !=0){
            if(x > 0 && y > 0){
                System.out.println("Primerio");

            } else if(x < 0 && y > 0) {
                System.out.println("Segundo");

            } else if((x < 0 && y < 0)) {
                System.out.println("Terceiro");

            } else if(x > 0 && y < 0) {
                System.out.println("Quarto");
            }
            x = sc.nextFloat();
            y = sc.nextFloat();
        }
        sc.close();
    }
}

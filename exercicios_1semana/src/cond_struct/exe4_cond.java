package cond_struct;

import java.util.Scanner;

public class exe4_cond {
    int hStart = 0;
    int hEnd = 0;
    Scanner sc = new Scanner(System.in);
    public exe4_cond(){
        System.out.printf("Digite a hora em que o jogo começa: ");
        hStart = sc.nextInt();
        System.out.printf("Digite a hora em que o jogo termina: ");
        hEnd = sc.nextInt();

        if (hStart < hEnd) {
            System.out.printf("O JOGO DUROU %d HORA(S)", hEnd - hStart);
        }
        else {
            System.out.printf("O JOGO DUROU %d HORA(S)", 24 - hStart + hEnd);
        }
        sc.close();
    }
}

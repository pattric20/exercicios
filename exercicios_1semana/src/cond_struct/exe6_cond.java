package cond_struct;

import java.util.Scanner;

public class exe6_cond {
    double num;
    Scanner sc = new Scanner(System.in);
    public exe6_cond(){
        System.out.print("Digite um número: ");
        this.num = sc.nextDouble();
        if (num <= 0 || num > 100) {
            System.out.print("Fora do Intervalo");
        }else if(num <= 25){
            System.out.print("Intervalo [0,25]");
        }else if(num <= 50){
            System.out.print("Intervalo (25,50]");
        }else if(num <= 75){
            System.out.print("Intervalo (50,75]");
        }else if(num <= 100){
            System.out.print("Intervalo (75,100]");
        }
    }
}

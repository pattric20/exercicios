package cond_struct;

import java.util.Scanner;

public class exe3_cond {
    Scanner sc = new Scanner(System.in);
    int x=0,y=0;
    public exe3_cond(){
        System.out.print("Digite o primeiro número: ");
        x = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        y = sc.nextInt();

        if(x%y == 0 || y%x == 0){
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }
    }
}

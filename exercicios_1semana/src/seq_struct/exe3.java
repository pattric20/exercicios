package cond_struct;

import java.util.Scanner;

public class exe3 {
    public exe3(){
        Scanner sc = new Scanner(System.in);
        int A=0,B=0,C=0,D=0;
        System.out.print("Entre com A: ");
        A = sc.nextInt();
        System.out.print("Entre com B: ");
        B = sc.nextInt();
        System.out.print("Entre com C: ");
        C = sc.nextInt();
        System.out.print("Entre com D: ");
        D = sc.nextInt();
        System.out.print("DIFERENCA = " + (A * B - C * D));
        sc.close();
    }
}

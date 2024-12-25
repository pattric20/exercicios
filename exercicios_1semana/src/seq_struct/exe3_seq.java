package seq_struct;

import java.util.Scanner;

public class exe3_seq{
    int A=0,B=0,C=0,D=0;
    public exe3_seq(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com A: ");
        this.A = sc.nextInt();
        System.out.print("Entre com B: ");
        this.B = sc.nextInt();
        System.out.print("Entre com C: ");
        this.C = sc.nextInt();
        System.out.print("Entre com D: ");
        this.D = sc.nextInt();
        System.out.print("DIFERENCA = " + (A * B - C * D));
        sc.close();
    }
}

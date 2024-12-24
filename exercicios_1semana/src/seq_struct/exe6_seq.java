package cond_struct;

import java.util.Locale;
import java.util.Scanner;

public class exe6_seq{
    public exe6_seq(){
        Scanner sc = new Scanner(System.in);
        float A = 0f,B = 0f, C=0f;
        Locale.setDefault(Locale.US);
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();
        System.out.printf("TRIANGULO: %.3f\n",(A*C)/2);
        System.out.printf("CIRCULO: %.3f\n",(C*C)*3.14159);
        System.out.printf("TRAPEZIO: %.3f\n",(((A+B)*C)/2));
        System.out.printf("QUADRADO: %.3f\n", B*B);
        System.out.printf("RETANGULO %.3f",A*B);
        sc.close();
    }
}

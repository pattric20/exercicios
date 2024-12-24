package cond_struct;

import java.util.Scanner;

public class exe2_seq {
    public exe2_seq(){
        Scanner sc = new Scanner(System.in);
        float raio=0f, pi = 3.14159f, area=0f;
        System.out.print("Qual o raio: ");
        raio = sc.nextFloat();
        area = pi*(raio*raio);
        System.out.printf("A area do círculo é de %f", area);
        sc.close();
    }
}

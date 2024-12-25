package seq_struct;

import java.util.Scanner;

public class exe2_seq {
    float raio=0, area=0;
    private final float pi = 3.14159f;
    public exe2_seq(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o raio: ");
        this.raio = sc.nextFloat();
        this.area = pi*(raio*raio);
        System.out.printf("A area do círculo é de %f", area);
        sc.close();
    }
}

package cond_struct;

import java.util.Scanner;

public class exe4_seq{
    public exe4_seq(){
        Scanner sc = new Scanner(System.in);
        int id=0, horas=0;
        float valorHora = 0f;
        System.out.print("Digite seu número do funcionário: ");
        id = sc.nextInt();
        System.out.print("Entre com as horas trabalhadas: ");
        horas = sc.nextInt();
        System.out.print("Entre com o valor recebido por hora: ");
        valorHora = sc.nextFloat();
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f ", id,horas*valorHora);
        sc.close();
    }
}

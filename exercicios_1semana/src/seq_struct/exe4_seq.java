package seq_struct;

import java.util.Scanner;

public class exe4_seq{
    int id;
    int horas=0;
    float valorHora = 0f;
    public exe4_seq(){
        Scanner sc = new Scanner(System.in);;
        System.out.print("Digite seu número do funcionário: ");
        this.id = sc.nextInt();
        System.out.print("Entre com as horas trabalhadas: ");
        this.horas = sc.nextInt();
        System.out.print("Entre com o valor recebido por hora: ");
        this.valorHora = sc.nextFloat();
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f ", id,horas*valorHora);
        sc.close();
    }
}

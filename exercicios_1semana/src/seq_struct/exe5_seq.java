package seq_struct;
import java.util.Locale;
import java.util.Scanner;

public class exe5_seq{
    int cod1=0, cod2=0, quant1 = 0, quant2=0;
    float valor1 = 0f,valor2 = 0f, valorF=0f;
    public exe5_seq(){
        Scanner sc = new Scanner(System.in);
        this.valorF=0f;
        Locale.setDefault(Locale.US);
        System.out.print("Entre com os dados da peça 1: ");
        this.cod1 = sc.nextInt();
        this.quant1 = sc.nextInt();
        this.valor1 = sc.nextFloat();
        System.out.print("Entre com os dados da peça 2: ");
        this.cod2 = sc.nextInt();
        this.quant2 = sc.nextInt();
        this.valor2 = sc.nextFloat();
        this.valorF = (quant1*valor1)+(quant2*valor2);
        System.out.printf("VALOR A PAGAR = R$ %.2f",valorF);
        sc.close();
    }
}

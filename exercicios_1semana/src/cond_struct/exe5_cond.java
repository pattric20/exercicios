package cond_struct;

import java.util.Scanner;

public class exe5_cond {
    Scanner sc = new Scanner(System.in);
    public exe5_cond(){
        System.out.print("Digite o codigo: ");
        int cod = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        int quant = sc.nextInt();

        switch (cod){
            case 1:
                System.out.printf("Total: R$ %.2f",quant*4.00);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f",quant*4.50);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f",quant*5.00);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f",quant*2.00);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f",quant*1.50);
                break;
        }
        sc.close();
    }
}

package cond_struct;

import java.util.Scanner;

public class exe1_cond {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    public exe1_cond(){
        System.out.print("Digite um número: ");
        this.num = sc.nextInt();
        if(num < 0){
            System.out.println("NEGATIVO");
            System.out.printf("%d é negativo",num);
        }else if(num > 0){
            System.out.println("NÃO NEGATIVO");
            System.out.printf("%d é positivo!",num);
        }else{
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }
}

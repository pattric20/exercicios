package cond_struct;

import java.util.Scanner;

public class exe2_cond {

    Scanner sc = new Scanner(System.in);
    int num = 0;
    public exe2_cond(){
        System.out.print("Digite um número: ");
        this.num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("PAR");
            System.out.printf("%d é par",num);

        }else{
            System.out.println("IMPAR");
            System.out.printf("%d é impar",num);
        }
        sc.close();
    }
}

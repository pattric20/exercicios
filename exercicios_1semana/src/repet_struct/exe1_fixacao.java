package repet_struct;

import java.util.Scanner;

public class exe1_fixacao{
    public exe1_fixacao(){
        Scanner sc =new Scanner(System.in);
        int x = 0, y = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        while(x != y){
            if(x < y){
                System.out.println("Crescente");
            }else{
                System.out.println("Decrescente");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}

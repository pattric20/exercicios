package repet_struct;

import java.util.Scanner;

public class exe2_fixacao{
    Scanner sc = new Scanner(System.in);
    float idade = sc.nextInt();
    float add = 0;
    int cont = 0;
    public exe2_fixacao(){
        if(idade < 0){
            System.out.println("Impossivel calcular");
        }else{
            while(idade > 0){
                add += idade;
                cont++;
                idade = sc.nextFloat();
            }
            System.out.printf("Media da idade: %.2f",add/cont);
        }
        sc.close();
    }
}

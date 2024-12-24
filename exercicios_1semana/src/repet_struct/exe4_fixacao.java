package repet_struct;

import java.util.Scanner;

public class exe4_fixacao{
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(), y = sc.nextInt(), cont = 0;
    public exe4_fixacao(){

        //Deixar x e y em ordem
        if(x > y){
            int w = x;
            x = y;
            y = w;
        }

        //Retira as borda de x
        if(x < 0){
            x = x+1;
        }else{
            x = x-1;
        }

        //Retira a borda de y
        y = y-1;
        for(int i = x; i <= y; i++){
            if(i%2 != 0){
                cont = cont + i;
            }
        }
        System.out.println(cont);
    }
}

package repet_struct;

import java.util.Scanner;

public class exe5_for{
    Scanner sc = new Scanner(System.in);
    public exe5_for(){
        int N = sc.nextInt();
        int fatorial=1;
        if(N == 0){
            System.out.println(1);
        }else{
            for(int i=1; i<=N; i++){
                fatorial = fatorial * i;
            }
        }
        System.out.println(fatorial);
    }
}

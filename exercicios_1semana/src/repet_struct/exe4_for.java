package repet_struct;

import java.util.Scanner;

public class exe4_for{
    Scanner sc = new Scanner(System.in);
    public exe4_for(){
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            double a= sc.nextDouble(), b=sc.nextDouble();
            if(b == 0){
                System.out.println("divisao impossivel");
            }else{
                System.out.println(a/b);
            }
        }
    }
}

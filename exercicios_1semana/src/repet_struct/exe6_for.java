package repet_struct;

import java.util.Scanner;

public class exe6_for{
    Scanner sc = new Scanner(System.in);
    public exe6_for(){
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}

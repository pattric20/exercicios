package repet_struct;

import java.util.Scanner;

public class exe1_for{
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    public exe1_for(){
        for(int i=1; i<= x; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}

package repet_struct;

import java.util.Scanner;

public class exe3_fixacao{
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    public exe3_fixacao(){
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n",i,num,i*num);
        }
        sc.close();
    }
}

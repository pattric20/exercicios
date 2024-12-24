package repet_struct;

import java.util.Scanner;

public class exe7_for{
    Scanner sc = new Scanner(System.in);
    public exe7_for(){
        int x = 0, n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(i);
            System.out.printf(" %d ",i*i);
            System.out.println(i*i*i);
        }
    }
}

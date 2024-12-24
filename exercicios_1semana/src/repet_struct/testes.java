package repet_struct;

import java.util.Scanner;

public class testes {
    Scanner sc = new Scanner(System.in);
    public testes(){

        int n = sc.nextInt();

        int fat = 1;
        for (int i=1; i<=n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        sc.close();
    }
}

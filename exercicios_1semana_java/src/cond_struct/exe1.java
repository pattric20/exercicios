package cond_struct;

import java.util.Scanner;

public class exe1 {
    public exe1(){
        System.out.print("Digite o primeiro número: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("\nDigite o segundo númeoro: ");
        int y = sc.nextInt();
        System.out.printf("%d + % d = %d: ", x, y, x + y);
        sc.close();
    }
}

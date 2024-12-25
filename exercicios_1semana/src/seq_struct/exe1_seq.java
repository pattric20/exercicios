package seq_struct;

import java.util.Scanner;

public class exe1_seq{
    int x;
    int y;
    public exe1_seq(){
        System.out.print("Digite o primeiro número: ");
        Scanner sc = new Scanner(System.in);
        this.x = sc.nextInt();
        System.out.print("\nDigite o segundo númeoro: ");
        this.y = sc.nextInt();
        System.out.printf("%d + % d = %d: ", x, y, x + y);
        sc.close();
    }
}

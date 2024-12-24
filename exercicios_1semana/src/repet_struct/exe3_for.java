package repet_struct;

import java.util.Scanner;

public class exe3_for{
    Scanner sc = new Scanner(System.in);
    public exe3_for(){
        int cases = sc.nextInt();
        double res[] = new double[cases];
        for (int i=0; i<cases; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            res[i] = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
        }
        for(int i=0; i<cases; i++){
            System.out.printf("%.1f%n", res[i]);
        }
        sc.close();
    }
}

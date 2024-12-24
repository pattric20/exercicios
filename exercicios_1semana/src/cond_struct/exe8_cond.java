package cond_struct;

import java.util.Scanner;

public class exe8_cond {
    Scanner sc = new Scanner(System.in);
    public exe8_cond(){
        System.out.print("Digite o salario: ");
        float imp = 0, sal = sc.nextFloat();
        if(sal <= 2000) {
            System.out.println("Isento");
        }else{
            if (sal > 2000 && sal <= 3000) {
                imp = (float) ((sal - 2000)*0.08);
            } else if (sal > 3000 && sal <= 4500) {
                imp = (float) ((1000*0.08)+(sal-3000)*0.18);
            } else if (sal > 4500) {
                imp = (float) ((1000*0.08)+(1500*0.18)+(sal-4500)*0.28);
            }
            System.out.printf("R$ %.2f", imp);
        }
        sc.close();
    }
}

package cond_struct;

import java.util.Scanner;

public class exe7_cond {
    Scanner sc = new Scanner(System.in);
    float x;
    float y;
    public exe7_cond(){
        System.out.print("Digite as coordenadas: ");
        this.x = sc.nextFloat();
        this.y = sc.nextFloat();

        if(x == 0 && y == 0){
            System.out.print("Origem");
        }else if(y == 0){
            System.out.print("Eixo x");
        }else if(x == 0){
            System.out.print("Eixo y");
        }else if(x > 0 && y > 0) {
            System.out.print("Q1");
        }else if(x < 0 && y > 0) {
            System.out.print("Q2");
        }else if(x < 0 && y < 0) {
            System.out.print("Q3");
        }else if(x > 0 && y < 0) {
            System.out.print("Q4");
        }
    }
}

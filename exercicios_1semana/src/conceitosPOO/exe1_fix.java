package conceitosPOO;

import java.util.Scanner;

public class exe1_fix {
    Scanner sc = new Scanner(System.in);
    double b;
    double h;
    public exe1_fix(){
        this.b = sc.nextDouble();
        this.h = sc.nextDouble();
    }

    public double area(){
        return b*h;
    }
    public double perimetro(){
        return (b+h)*2;
    }
    public double diagonal(){
        return Math.sqrt(h*h + b*b);
    }
}

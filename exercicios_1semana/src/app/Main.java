package app;
import java.util.Locale;
import java.util.Scanner;

import exe_vector.*;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m= sc.nextInt(),n= sc.nextInt();
        Matriz mat = new Matriz(m,n);
        mat.printPosViz(sc.nextInt());
    }
}
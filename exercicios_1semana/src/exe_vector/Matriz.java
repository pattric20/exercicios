package exe_vector;

import java.util.Scanner;

public class Matriz {
    Scanner sc = new Scanner(System.in);
    private int [][] m;
    public Matriz(int m, int n) {
        this.m = new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                this.m[i][j] = sc.nextInt();
    }

    public void printPosViz(int num){
        for(int i=0;i<m.length;i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(m[i][j] == num){
                    System.out.println("Position " + i+","+j);
                    if(j-1 >= 0) System.out.println("Left: " + m[i][j-1]);
                    if(j < m.length) System.out.println("Right: " +m[i][j+1]);
                    if(i-1 >= 0) System.out.println("Up: " +m[i-1][j]);
                    if(i < m[i].length) System.out.println("Down: " +m[i+1][j]);
                }
            }
        }
    }
}

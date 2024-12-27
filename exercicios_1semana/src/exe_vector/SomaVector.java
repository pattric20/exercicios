package exe_vector;

import java.util.Arrays;
import java.util.Scanner;

public class SomaVector {
    Scanner sc = new Scanner(System.in);
    private float[] vector;
    private float soma;
    public SomaVector(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto números você vai digitar? ");
        int n = sc.nextInt();
        vector = new float[n];
        for(int i=0; i< vector.length;i++){
            System.out.printf("Digite o %dº número: ",i+1);
            vector[i]= sc.nextInt();
            soma += vector[i];
        }
    }

    public String getAllValores(){
        String valores = "";
        for(int i=0; i < vector.length; i++)
            valores += "   " + vector[i];
        return valores;
    }

    public float getSoma() {
        return soma;
    }

    public float getMedia(){
        return getSoma()/ vector.length;
    }
}

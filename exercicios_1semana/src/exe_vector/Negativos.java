package exe_vector;

import java.util.Scanner;

public class Negativos{
    Scanner sc = new Scanner(System.in);
    private int[] vector;
    public Negativos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto números você vai digitar? ");
        int n = sc.nextInt();
        vector = new int[n];
        for(int i=0; i< vector.length;i++){
            System.out.printf("Digite o %dº número: ",i+1);
            vector[i]= sc.nextInt();
        }
    }

    public void printNegative(){
        System.out.println("\nNUMEROS NEGATIVOS: ");
        for(int i=0; i< vector.length;i++){
            if(vector[i] < 0){
                System.out.println(vector[i]);
            }
        }
    }
}

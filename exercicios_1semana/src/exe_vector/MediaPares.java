package exe_vector;

import java.util.Scanner;

public class MediaPares {
    Scanner sc = new Scanner(System.in);
    private int[] nums;
    public MediaPares(){
        System.out.print("Quantos elementos vai ter o vetor? ");
        nums = new int[sc.nextInt()];
        for(int i=0;i<nums.length;i++){
            System.out.printf("Digite o %dº numero: ",i+1);
            nums[i] = sc.nextInt();
        }
    }

    public String meanPairs(){
        float mean=0;
        int quantPairs=0;
        for(int i:nums){
            if(i%2==0){
                mean+=i;
                quantPairs++;
            }
        }
        if(quantPairs==0){
            return "NENHUM NUMERO PAR";
        }else{
            return String.format("MEDIA DOS PARES = %.1f",mean/quantPairs);
        }
    }
}

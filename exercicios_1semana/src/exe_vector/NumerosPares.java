package exe_vector;

import java.util.Scanner;

public class NumerosPares{
    Scanner sc = new Scanner(System.in);
    int[] nums;
    public NumerosPares(int quant){
        nums = new int[quant];
        for(int i=0; i<nums.length;i++){
           System.out.printf("Digite o %dº numero: ",i+1);
           nums[i] = sc.nextInt();
        }
    }

    public int quantPares(){
        int quant=0;
        for(int i:nums){
            if(i%2 == 0){
                quant++;
            }
        }
        return quant;
    }

    public int[] printPares(){
        int[] vecPares = new int[quantPares()];
        int i=0;
        for(int x:nums){
            if(x%2 == 0){
                vecPares[i] = x;
                i++;
            }
        }
        return vecPares;
    }
}

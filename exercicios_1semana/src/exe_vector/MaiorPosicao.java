package exe_vector;

import java.util.Scanner;

public class MaiorPosicao {
    Scanner sc = new Scanner(System.in);
    private float[] nums;
    public MaiorPosicao(int quant) {
        nums = new float[quant];
        for(int i=0; i<nums.length;i++){
            System.out.printf("Digite o %dº numero: ",i+1);
            nums[i] = sc.nextInt();
        }
        sc.close();
    }

    public float getMaior(){
        float maior=nums[0];
        for(float i:nums){
            if(i>maior)
                maior = i;
        }
        return maior;
    }

    public int getPosMaior(){
        int pos=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]>nums[pos])
                pos = i;
        }
        return pos;
    }
}

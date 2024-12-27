package exe_vector;

import java.util.Scanner;

public class AbaixoMedia {
    Scanner sc = new Scanner(System.in);
    float[] nums;
    public AbaixoMedia(int N) {
        nums = new float[N];
        for(int i=0; i<nums.length;i++){
            System.out.printf("Digite o %dº numero:",i+1);
            nums[i] = sc.nextFloat();
        }
        sc.close();
    }

    public float meanVector(){
        float som=0;
        for(float i:nums)
            som+=i;
        return som/nums.length;
    }

    public int contBelowMean(){
        int cont=0;
        float mean = meanVector();
        for(float i:nums)
            if(i<mean)
                cont++;
        return cont;
    }

    public float[] belowMean(){
        float[] below = new float[contBelowMean()];
        float mean = meanVector();
        int i=0;
        for(float f:nums){
            if(f<mean){
                below[i] = f;
                i++;
            }
        }
        return below;
    }
}

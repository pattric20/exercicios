package exe_vector;
import java.util.Arrays;
import java.util.Scanner;
public class SomaVetores {
    Scanner sc = new Scanner(System.in);
    float[] A, B;
    public SomaVetores(int quant){
        A = new float[quant];
        B = new float[quant];
        System.out.println("Digite os valores do vetor A:");
        for(int i=0; i<A.length;i++)
            A[i] = sc.nextFloat();
        System.out.println("Digite os valores do vetor B:");
        for(int i=0; i<B.length;i++)
            B[i] = sc.nextFloat();
    }

    public float[] vectorResultante(){
        float[] resultante = new float[A.length];
        for(int i=0; i<resultante.length;i++)
            resultante[i]=A[i]+B[i];
        return resultante;
    }

    public void printVector(float[] vector) {
        for(float i:vector)
            System.out.println(i);
    }
}

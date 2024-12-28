package exe_vector;
import java.util.Scanner;
public class Aprovados {
    Scanner sc = new Scanner(System.in);
    private String[] name;
    private float[] nota1;
    private float[] nota2;

    public Aprovados() {
        System.out.print("Quantos alunos serao digitados? ");
        int quant = sc.nextInt();
        name = new String[quant];
        nota1 = new float[quant];
        nota2 = new float[quant];
        System.out.println();
        for(int i=0;i<name.length;i++){
            System.out.printf("Digite nome, primeira e segunda nota do %dº aluno: \n",i+1);
            sc.nextLine();
            name[i] = sc.nextLine();
            nota1[i] = sc.nextFloat();
            nota2[i] = sc.nextFloat();
            System.out.println();
        }
    }

    public int quantApproved(){
        int approved= 0;
        for(int i=0; i<name.length;i++)
            if((nota1[i]+nota2[i])/2 >= 6.0)
                approved++;

        return approved;
    }

    public String[] approvedStudents(){
        String[] approved = new String[quantApproved()];
        int cont=0;
        for(int i=0; i<name.length;i++) {
            if ((nota1[i] + nota2[i])/2 >= 6.0) {
                approved[cont] = name[i];
                cont++;
            }
        }
        return approved;
    }
}

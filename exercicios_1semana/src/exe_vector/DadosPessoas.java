package exe_vector;
import java.util.Scanner;
public class DadosPessoas {
    Scanner sc = new Scanner(System.in);
    Pessoas[] heightGender;
    public DadosPessoas() {
        System.out.print("Quantas pessoas serao digitadas? ");
        heightGender = new Pessoas[sc.nextInt()];
        for(int i=0; i<heightGender.length;i++){
            System.out.printf("Altura da %dª pessoa: ",i+1);
            float height = sc.nextFloat();
            System.out.printf("Genero da %dª pessoa: ",i+1);
            char gender = sc.next().charAt(0);
            heightGender[i] = new Pessoas(height,gender);
            System.out.println();
        }
    }
    public float lowerHeight(){
        Pessoas nobody = heightGender[0];
        for(int i=1; i<heightGender.length;i++)
            if(nobody.getHeight() > heightGender[i].getHeight())
                nobody = heightGender[i];
        return nobody.getHeight();
    }

    public float greaterHeight() {
        Pessoas nobody = heightGender[0];
        for(int i=1; i<heightGender.length;i++)
            if(nobody.getHeight() < heightGender[i].getHeight())
                nobody = heightGender[i];
        return nobody.getHeight();
    }

    public float meanWomen(){
        float mean = 0.0f;
        int cont=0;
        for(Pessoas p:heightGender) {
            if (p.getGender() == 'F') {
                mean+=p.getHeight();
                cont++;
            }
        }
        return mean/cont;
    }

    public int numberMen() {
        int men=0;
        for(Pessoas p:heightGender)
            if(p.getGender() == 'M')
                men++;
        return men;
    }
}

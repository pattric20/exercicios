package exe_vector;
import java.util.Scanner;
public class Alturas{
    Scanner sc = new Scanner(System.in);
    Pessoas[] height;
    public Alturas() {
        System.out.print("Quantas pessoas serao digitadas? ");
        int x = sc.nextInt();
        height = new Pessoas[x];
        for(int i=0; i<height.length;i++){
            System.out.printf("Dados da %dº pessoa: \nNome: ",i+1);
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            float altura = sc.nextFloat();
            height[i] = new Pessoas(name, age, altura);
            System.out.println();
        }
    }
    public float meanHeight(){
        float mean = 0;
        for(Pessoas x:height)
            mean += x.getHeight();
        return mean/height.length;
    }

    public int countPessoas(int age){
        int pessoas = 0;
        for(Pessoas p:height) {
            if(p.getAge() < age){
                pessoas++;
            }
        }
        return pessoas;
    }

    public String[] getpercetPessoas(){
        System.out.print("Qual a idade deseja procurar: ");
        int age = sc.nextInt(), quantPessoas = countPessoas(age);
        String[] vector = new String[quantPessoas+1];
        vector[0] = String.format("%.1f",(float)(quantPessoas*100)/height.length) + "%";

        int i = 1;
        for(Pessoas p:height){
            if(p.getAge() < age) {
                vector[i] = p.getName();
                i++;
            }
        }
        return vector;
    }
}

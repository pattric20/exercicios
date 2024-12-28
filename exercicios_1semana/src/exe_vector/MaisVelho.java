package exe_vector;
import java.util.Scanner;
public class MaisVelho{
    Scanner sc = new Scanner(System.in);
    Pessoas[] older;
    public MaisVelho() {
        System.out.print("Quantas pessoas voce vai digitar? ");
        older = new Pessoas[sc.nextInt()];
        for(int i=0; i<older.length;i++) {
            System.out.printf("Dados da %dº pessoa: \nNome: ", i+1);
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            older[i] = new Pessoas(name,age);
            System.out.println();
        }
    }

    public String older(){
        Pessoas old = new Pessoas("Não Encontrado", -1);
        for(Pessoas p:older){
            if(old.getAge() < p.getAge()){
                old = p;
            }
        }
        return "PESSOA MAIS VELHA = " +old.getName();
    }


}
package repet_struct;

import java.util.Scanner;

public class exe1_while{
    public exe1_while(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String key = sc.nextLine();
        while (!key.equals("2002")){
            System.out.println("Senha Invalida");
            System.out.print("Digite a senha: ");
            key = sc.nextLine();
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}

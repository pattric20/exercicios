package app;
import java.util.Locale;
import java.util.Scanner;
import conceitosPOO.*;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do titular dan conta: ");
        String name = sc.nextLine();
        System.out.print("Digite o numero da conta: ");
        int contaID = sc.nextInt();
        exe_bank conta;
        System.out.print("Quer fazer um deposito inicial? (y ou n): ");
        char dep = sc.next().charAt(0);
        if(dep == 'y') {
            System.out.print("Digite o valor: ");
            float depositoIni = sc.nextFloat();
            conta = new exe_bank(contaID,name,depositoIni);
        }else{
            conta = new exe_bank(contaID,name);
        }

        System.out.println(conta.toString());

        System.out.print("\n\nDigite o valor para deposito: ");
        conta.deposito(sc.nextFloat());

        System.out.println(conta.toString());

        System.out.print("\n\nDigite o valor para saque: ");
        conta.saque(sc.nextFloat());

        System.out.println(conta.toString());

        sc.close();
    }
}
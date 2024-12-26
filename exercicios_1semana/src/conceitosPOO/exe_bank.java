package conceitosPOO;

import java.util.Scanner;

public class exe_bank {
    private int conta;
    private String name;
    private float saldo;

    public exe_bank(int conta,String name) {
        this.conta = conta;
        this.name = name;
    }
    public exe_bank(int conta,String name,float depositoIni) {
        this.conta = conta;
        this.name = name;
        deposito(depositoIni);
    }

    public int getConta() {return conta;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public float getSaldo() {return saldo;}
    public void setSaldo(float saldo) {this.saldo = saldo;}

    public String toString() {
        return "conta = " + conta +
                ", name = " + name +
                ", saldo = $ " + String.format("%.2f",saldo);
    }

    public void deposito(float deposito){
        float total = getSaldo() + deposito;
        setSaldo(total);
    }

    public void saque(float saque){
        float total = (float) (getSaldo() - saque - 5.00);
        setSaldo(total);
    }


    /* Esta função foi feita para diminuir a quantidade de codigo no main,
     pois ele será usado em outros programas*/
    public void init_app(){
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

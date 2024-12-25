package conceitosPOO;

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
}

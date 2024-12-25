package conceitosPOO;

import java.util.Scanner;

public class exe2_fix {
    Scanner sc = new Scanner(System.in);
    private String name;
    private double glossSalari;
    private double tax;
    public exe2_fix(){
        this.name = sc.nextLine();
        this.glossSalari = sc.nextDouble();
        this.tax = sc.nextDouble();
    }

    public void acresSalario(float acres){
        glossSalari = glossSalari + glossSalari*acres/100;
    }
    public double salarioLiq(){
        System.out.println(glossSalari);
        return glossSalari - tax;
    }

    public String getName(){return name;}
    public double getGlossSalari(){return glossSalari;}
    public double getTax(){return tax;}

}

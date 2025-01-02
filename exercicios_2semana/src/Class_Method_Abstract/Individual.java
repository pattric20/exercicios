package Class_Method_Abstract;

public class Individual extends TaxPayer{
    private double healthExpenditure;

    public Individual(double healthExpenditure) {super();}

    public Individual(String name, double anuallncome, double healthExpenditure) {
        super(name, anuallncome);
        this.healthExpenditure = healthExpenditure;
    }
    public double getHealthExpenditure() {return healthExpenditure;}
    public void setHealthExpenditure(double healthExpenditure) {this.healthExpenditure = healthExpenditure;}

    @Override
    public double tax() {
        double tax = getAnuallncome()*0.15;
        if(getAnuallncome() > 20000)
            tax = getAnuallncome()*0.25;
        tax -= getHealthExpenditure() * 0.5;
        return tax;
    }
}

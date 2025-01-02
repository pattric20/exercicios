package Class_Method_Abstract;

public class Company extends TaxPayer{
    private int numberOfEmployees;

    public Company() {super();}

    public Company(String name, double anuallncome, int numberOfEmployees) {
        super(name, anuallncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {return numberOfEmployees; }
    public void setNumberOfEmployees(int numberOfEmployees) {this.numberOfEmployees = numberOfEmployees;}

    @Override
    public double tax(){
        double tax = getAnuallncome()*0.16;
        if(getNumberOfEmployees() > 10)
            tax = getAnuallncome()*0.14;
        return tax;
    }
}

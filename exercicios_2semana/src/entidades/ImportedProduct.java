package entidades;

public class ImportedProduct extends Product{
    private double customsFree;
    public ImportedProduct(String name, double price, double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public double getCustomsFree() {return customsFree;}
    public void setCustomsFree(double customsFree) {this.customsFree = customsFree;}

    public double totalPrice(){return getPrice() + customsFree;}

    public String priceTag(){
        return getName() + " $" + totalPrice() + " (Customs free: $" + getCustomsFree() + ")";
    }
}

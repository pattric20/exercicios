package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;
    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {return manufactureDate;}
    public void setManufactureDate(LocalDate manufactureDate) {this.manufactureDate = manufactureDate;}

    public String priceTag(){
        return getName() + " (used) $" + getPrice() + " (Manufacture date: " +
                getManufactureDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }
}

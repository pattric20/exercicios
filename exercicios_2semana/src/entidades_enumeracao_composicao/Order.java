package entidades_enumeracao_composicao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> listOI = new ArrayList<>();
    private Client client;

    public Order(){}
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {return client;}
    public void setClient(Client client) {this.client = client;}

    public void addItem(OrderItem item) {listOI.add(item);}
    public void removeItem(OrderItem item) {listOI.remove(item);}
    public double total(){
        double total=0;
        for(OrderItem i: listOI)
            total+=i.subTotal();
        return total;
    }

    public String printListItems(){
        StringBuilder items = new StringBuilder();
        for(OrderItem i:listOI)
            items.append(i.toString()).append("\n");
        return items.toString();
    }

    @Override
    public String toString() {
        return "ORDER SUMARY:" +
                "\nOrder moment: " + sdf.format(getMoment()) +
                "\nOrder status: " + getStatus() +
                "\n" + client.toString() +
                "\nORDER ITEMS: " +
                "\n" + printListItems() +
                "Total price: $" + String.format("%.2f",total());
    }
}

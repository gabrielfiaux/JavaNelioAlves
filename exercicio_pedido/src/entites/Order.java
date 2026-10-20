package entites;

import entites.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Order {
    DateTimeFormatter OrderFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
    DateTimeFormatter birthDayFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
    //usar o string builder
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orderItemsList = new ArrayList<>();

    public Order(OrderStatus status, Client client) {
        this.moment = LocalDateTime.now();
        this.status = status;
        this.client = client;
    }

    public List<OrderItem> getOrderItemsList() {
        return orderItemsList;
    }

    public void setOrderItemsList(List<OrderItem> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Order Moment: ");
        strBuilder.append(OrderFormatter.format(moment) + "\n");
        strBuilder.append("Order Status: ");
        strBuilder.append(status + "\n");
        strBuilder.append("Cliente: ");
        strBuilder.append(client.getName() + " ");
        strBuilder.append("(" + birthDayFormatter.format(client.getBirthDate()) + ")");
        strBuilder.append("- " + client.getEmail() + "\n");
        strBuilder.append("Order Items: \n");
        for (OrderItem item : orderItemsList) {
            strBuilder.append(item + "\n");

        }
        strBuilder.append("Total price: $");
        strBuilder.append(String.format("%.2f", total()));


        return strBuilder.toString();
    }

    public void addItem(OrderItem item) {
        orderItemsList.add(item);

    }

    public void removeItem(OrderItem item) {
        orderItemsList.remove(item);
    }

    public Double total() {
        Double total = 0.0;
        for (OrderItem orderItem : orderItemsList) {
            total += orderItem.subTotal();

        }
        return total;
    }
    //OrderSumary
}

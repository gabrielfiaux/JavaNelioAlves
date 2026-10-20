package entites;

public class OrderItem {
    private Integer quantity;
    private Double price;
    //product
    private Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.price = product.getPrice();
        this.product = product;
    }
//não faz muito sentido editar um pedido finalizado


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return product.getName() +","+ " $ "+getPrice()+", Quantity: "+getQuantity()+" Subtotal: $ "+subTotal();
    }
    public double subTotal(){
       return getPrice()*getQuantity();
    }

}


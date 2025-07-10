import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> cart;
    private double totalPrice;

    public Sale() {
        this.cart = new ArrayList<>();
    }

    public void addProduct(Product p) {
        cart.add(p);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void calculateTotal() throws EmptySaleException {
        if (cart.isEmpty()) {
            throw new EmptySaleException("To make a sale you first have to add products");
        } else {
            totalPrice = 0;
            for (var p : cart) {
                totalPrice += p.getPrice();
            }
        }

    }

}

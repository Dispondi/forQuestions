import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Goods> cart = new ArrayList<>();

    public ShoppingCart() {
    }

    public void AddToCart(Goods stuff) {
        cart.add(stuff);
    }

    public ArrayList<Goods> getCart() {
        return cart;
    }
}

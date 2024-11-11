import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Goods bananas = new Goods("banana", 150, 10);
        ShoppingCart cart = new ShoppingCart();
        cart.AddToCart(bananas);

        for (Goods i : cart.getCart()) {
            System.out.println(i.getName());
        }
    }
}
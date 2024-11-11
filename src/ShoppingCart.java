import java.util.ArrayList;

public class ShoppingCart {
    private final ArrayList<Goods> cart = new ArrayList<>();
    public static final int MAX_SIZE_OF_CART = 100;
    private int currentSize = 0;

    public ShoppingCart() {
    }

    // перегрузка
    public void AddToCart(Goods stuff) {
        if (currentSize + stuff.getAmount() <= MAX_SIZE_OF_CART) {
            currentSize += stuff.getAmount();
            cart.add(stuff);
        }
    }

    public void AddToCart(Bads stuff) {
        System.out.println("Can't add stuff to cart 'cause " + stuff.getName() + " is bad");
    }

    // геттер
    public ArrayList<Goods> getCart() {
        return cart;
    }

    public int getCurrentSize() {
        return currentSize;
    }
}

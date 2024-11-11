public class Main {
    public static void main(String[] args) {
        Goods bananas = new Goods("banana", 150, 10);
        Goods apples = new Goods("apple", 300, 20);
        Bads SmthBad = new Bads("illegal one"); // Ну если товары - это хорошо, то плохо - это что-то нелегальное, логично? ._.

        ShoppingCart cart = new ShoppingCart();
        cart.AddToCart(bananas);
        cart.AddToCart(apples);
        cart.AddToCart(SmthBad);

        System.out.println(ShoppingCart.MAX_SIZE_OF_CART + " - максимальный размер");
        System.out.println(cart.getCurrentSize()  + " - размер сейчас в корзине" );

        System.out.println("В корзине: ");
        for (Goods i : cart.getCart()) {
            System.out.println(i.getName() + " цена: " + i.getPrice());
        }

    }
}
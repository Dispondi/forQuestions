public class Goods {
    private String name;
    private int price;
    private int amount;

    public Goods(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    // геттеры
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}

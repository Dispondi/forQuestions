public class Bads extends Goods { // наследование

    public Bads (String name) {
        super(name, 0, 0);
    }

    // переопределение
    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}

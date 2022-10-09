package variant_A.task_5;

public class Main {
    public static void main(String[] args) {
        Stretchiness suitStretchiness = Stretchiness.FRAGILE;
        Suit suit = new Suit(suitStretchiness);
        suit.stretch();
        suit.setSize(42);
        suit.setPrice(500);
        suit.setManufacturer("Korea");
        suit.info();
    }
}

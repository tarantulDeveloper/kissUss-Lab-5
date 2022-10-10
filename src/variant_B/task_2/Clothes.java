package variant_B.task_2;

public abstract class Clothes {
    private final SizesEnum size;
    private final double price;
    private final String color;

    public Clothes(SizesEnum size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }


    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

package variant_A.task_5;

public class Suit extends Cloth {
    private final Stretchiness stretchiness;

    public Suit(Stretchiness stretchiness) {
        this.stretchiness = stretchiness;
    }

    @Override
    public void stretch() {
        System.out.println("The stretchiness of this suit is: " + stretchiness);
    }

    @Override
    public void info() {
        System.out.println("The price is: " + super.getPrice() + "$, "
                            + "manufacturer: " + super.getManufacturer() + ", "
                            + "size: " + super.getSize());
    }
}

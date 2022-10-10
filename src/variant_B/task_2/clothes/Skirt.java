package variant_B.task_2.clothes;

import variant_B.task_2.Clothes;
import variant_B.task_2.FemaleClothes;
import variant_B.task_2.SizesEnum;

public class Skirt extends Clothes implements FemaleClothes {

    public Skirt(SizesEnum size, double price, String color) {
        super(size, price, color);
    }

    public void check() {
        FemaleClothes.super.dressAWoman(this.getColor(), this.getClass().getSimpleName());
    }
}

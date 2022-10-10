package variant_B.task_2.clothes;

import variant_B.task_2.Clothes;
import variant_B.task_2.FemaleClothes;
import variant_B.task_2.MaleClothes;
import variant_B.task_2.SizesEnum;

public class Pants extends Clothes implements FemaleClothes, MaleClothes {

    public Pants(SizesEnum size, double price, String color) {
        super(size, price, color);
    }

    public void checkWoman() {
        FemaleClothes.super.dressAWoman(this.getColor(), this.getClass().getSimpleName());
    }

    public void checkMan() {
        MaleClothes.super.dressAMan(this.getColor(), this.getClass().getSimpleName());
    }
}

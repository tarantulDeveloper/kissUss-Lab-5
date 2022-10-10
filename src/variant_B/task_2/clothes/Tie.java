package variant_B.task_2.clothes;

import variant_B.task_2.Clothes;
import variant_B.task_2.MaleClothes;
import variant_B.task_2.SizesEnum;

public class Tie extends Clothes implements MaleClothes {

    public Tie(SizesEnum size, double price, String color) {
        super(size, price, color);
    }

    public void check() {
        MaleClothes.super.dressAMan(this.getColor(), this.getClass().getSimpleName());
    }
}

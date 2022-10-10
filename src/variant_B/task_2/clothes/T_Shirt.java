package variant_B.task_2.clothes;

import variant_B.task_2.Clothes;
import variant_B.task_2.FemaleClothes;
import variant_B.task_2.MaleClothes;
import variant_B.task_2.SizesEnum;

public class T_Shirt extends Clothes implements FemaleClothes, MaleClothes {


    public T_Shirt(SizesEnum size, double price, String color) {
        super(size, price, color);
    }


    public void checkWoman() {
        FemaleClothes.super.dressAWoman(this.getColor(), this.getClass().getSimpleName());
    }

    public void checkMan() {
        MaleClothes.super.dressAMan(this.getColor(), this.getClass().getSimpleName());
    }

}

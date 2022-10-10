package variant_B.task_2;

import variant_B.task_2.clothes.Pants;
import variant_B.task_2.clothes.Skirt;
import variant_B.task_2.clothes.T_Shirt;
import variant_B.task_2.clothes.Tie;

public class Main {
    public static void main(String[] args) {
        //testing clothes
        T_Shirt t_shirt = new T_Shirt(SizesEnum.S, 300, "red");
        t_shirt.checkWoman();
        Tie tie = new Tie(SizesEnum.XXS,150,"green");
        tie.check();
        System.out.println();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println();

        //creating array of clothes
        Clothes[] clothes = {
                new T_Shirt(SizesEnum.XXS,250,"blue"),
                new Pants(SizesEnum.M, 300, "black"),
                new Skirt(SizesEnum.S, 280, "red"),
                new Tie(SizesEnum.L, 400, "pink")
        };

        Atelier.dressAMan(clothes);
        System.out.println("------------------------------------------");
        Atelier.dressAWoman(clothes);





    }
}

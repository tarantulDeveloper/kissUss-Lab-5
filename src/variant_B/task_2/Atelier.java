package variant_B.task_2;

public class Atelier {
    public static void dressAWoman(Clothes[] clothes) {
        System.out.println("Female dress: ");
        for (Clothes c : clothes) {
            if (c instanceof FemaleClothes) {
                System.out.println(c.getClass().getSimpleName() + ": " + c);
            }
        }
    }

    public static void dressAMan(Clothes[] clothes) {
        System.out.println("Male clothes:");
        for (Clothes c : clothes) {
            if (c instanceof MaleClothes) {
                System.out.println(c.getClass().getSimpleName() + ": " + c);

            }
        }
    }
}

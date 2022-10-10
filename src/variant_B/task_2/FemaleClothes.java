package variant_B.task_2;

public interface FemaleClothes {
    default void dressAWoman(String color, String clothName) {
        System.out.println("This woman puts on a " + color + " " + clothName);
    }


}

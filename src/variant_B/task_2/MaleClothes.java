package variant_B.task_2;

public interface MaleClothes {
    default void dressAMan(String color, String clothName) {
        System.out.println("This man puts on a " + color + " " + clothName);
    }

}

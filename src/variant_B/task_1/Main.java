package variant_B.task_1;

public class Main {
    public static void main(String [] args){
        Season season1 = Season.SUMMER;
        System.out.println(season1);
        SeasonDemo seasonDemo = new SeasonDemo();
        seasonDemo.print(Season.AUTUMN);
        seasonDemo.printAllValues();

        Season season2=Season.valueOf("WINTER");
        System.out.println(season2);
    }
}

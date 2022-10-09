package variant_B.task_1;

public class SeasonDemo {

    public void print (Season season ){
        switch (season){
            case WINTER:
                System.out.println("I like winter ");
                break;
            case SPRING:
                System.out.println("I like spring ");
                break;
            case AUTUMN:
                System.out.println("I like autumn ");
                break;
            case SUMMER:
                System.out.println("I like summer ");
                break;
        }
    }
    public void printAllValues(){
        for(Season r:Season.values()){
            System.out.println(r+" "+r.getAvgTmp()+" "+r.getDescription());

        }

    }

}

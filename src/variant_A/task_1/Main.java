package variant_A.task_1;

public class Main {
    public static void main(String[] args) {
      Type typeEnciloped=Type.COATED;
      Encyclopedia encyclopedia=new Encyclopedia(typeEnciloped);
      encyclopedia.printPapiar();
      encyclopedia.setName("LIVE");
      encyclopedia.setPrice(500);
      encyclopedia.setAmaunt(20);
      encyclopedia.info();


    }
}
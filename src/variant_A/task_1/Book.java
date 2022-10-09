package variant_A.task_1;

abstract class  Book implements Publication{
     private String name;
     private int price;
     private int amaunt;


     abstract void info();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmaunt() {
        return amaunt;
    }

    public void setAmaunt(int amaunt) {
        this.amaunt = amaunt;
    }

    public abstract void printPapiar();

    public abstract void print();
}

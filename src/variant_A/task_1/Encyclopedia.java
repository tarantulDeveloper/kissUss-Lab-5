package variant_A.task_1;

public class Encyclopedia extends Book{
    private final Type type;

    public Encyclopedia(Type type) {
        this.type = type;
    }

    @Override
    void info() {
        System.out.println("The name is: "+getName()+
                        "   price: "+getPrice()+
                         "   amaunt: "+getAmaunt());

    }

    @Override
    public void printPapiar() {
        System.out.println("Encyclopedias paper type is : "+type);

    }

    @Override
    public void print() {

    }

}

package variant_A.task_1;

public class Directory extends Book{
 private final Type type;

    public Directory(Type type) {
        this.type = type;
    }

    @Override
    void info() {
       System.out.println("The name directory is: "+getName()+
               "   price: "+getPrice()+
               "   amaunt: "+getAmaunt());

    }

    @Override
    public void printPapiar() {
       System.out.println("Directorys paper type is : "+type);
    }

    @Override
    public void print() {

    }


}

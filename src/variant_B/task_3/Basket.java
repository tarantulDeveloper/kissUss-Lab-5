package variant_B.task_3;

import java.util.ArrayList;

public class Basket {
    ArrayList<Product> products;
    {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void showAllProduct() {
        System.out.println(products);
    }

    public void buy() {
        double totalPrice = 0;
        for(Product product : products) {
            totalPrice += product.getPrice();
        }
        System.out.println("Total price: " + totalPrice);
    }
}

package variant_B.task_3;

import java.util.ArrayList;

public interface ShopInterface {
    Product chooseProduct(String productName);
    ArrayList<Product> filterByCategory(Category category);
}
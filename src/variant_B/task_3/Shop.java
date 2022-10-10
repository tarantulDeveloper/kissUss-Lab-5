package variant_B.task_3;

import java.util.ArrayList;

public class Shop implements ShopInterface {
    ArrayList<Product> allProducts = new ArrayList<>();

    public void addProductToShop(Product product)  {
        allProducts.add(product);
    }

    public void showAllProducts() {
        for (Product product : allProducts) {
            System.out.println(product);
        }
    }

    @Override
    public Product chooseProduct(String productName) {
        for (Product product : allProducts) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Product> filterByCategory(Category category) {
        ArrayList<Product> filteredProducts = new ArrayList<>();
        for(Product product : allProducts) {
            if (product.getCategory().equals(category)){
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}

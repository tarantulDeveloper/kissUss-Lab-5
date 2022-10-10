package variant_B.task_3;

public class Customer {
    private String name;
    private String password;

    private Basket basket;

    public Customer(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Basket getBasket() {
        return basket;
    }
}

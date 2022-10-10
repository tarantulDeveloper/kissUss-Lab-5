package variant_B.task_3;

import java.util.Scanner;

public class Main {
    static Shop shop = new Shop();

    public static void main(String[] args) {

        //filling shop with products:
        Product product1 = new Product("apple", 23, Category.FOOD);
        Product product2 = new Product("phone", 15000, Category.ELECTRONICS);
        Product product3 = new Product("rose", 120, Category.PLANTS);
        Product product4 = new Product("kaktus", 100, Category.PLANTS);
        Product product5 = new Product("cherry", 27, Category.FOOD);

        shop.addProductToShop(product1);
        shop.addProductToShop(product2);
        shop.addProductToShop(product3);
        shop.addProductToShop(product4);
        shop.addProductToShop(product5);

        menu();

    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        Customer customer = new Customer(name, password);

        //creating the basket:
        Basket customerBasket = new Basket();

        customerMethod(customerBasket, customer);

    }

    public static void customerMethod(Basket customerBasket, Customer customer) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("All products in the shop:");
        shop.showAllProducts();
        System.out.println();
        System.out.println("1) Choose product to add to a basket");
        System.out.println("2) Buy products in basket.");
        System.out.println("3) Show my basket.");
        System.out.println("4) Exit to the main menu.");

        int customerChoose = scanner.nextInt();

        switch (customerChoose) {
            case 1 -> {
                System.out.println("Enter product name:");
                String productName = scanner.next();
                Product product = shop.chooseProduct(productName);
                customerBasket.addProduct(product);
                customer.setBasket(customerBasket);
                customerMethod(customerBasket, customer);
            }
            case 2 -> {
                customerBasket.buy();

            }
            case 3 -> {
                customerBasket.showAllProduct();
                System.out.println("****************************");
                customerMethod(customerBasket, customer);
            }
            default -> menu();
        }


    }

    public static void menu() {
        Category[] categories = Category.values();

        mainLoop:
        while (true) {
            ActionEnum action;
            System.out.println("----------------------------------");
            System.out.println("What to do?");
            System.out.println("1) Login.");
            System.out.println("2) Show all categories.");
            System.out.println("3) Show products by category.");
            System.out.println("4) Exit");
            Scanner scanner = new Scanner(System.in);
            int actionNumber = scanner.nextInt();

            switch (actionNumber) {
                case 1:
                    action = ActionEnum.LOGIN;
                    break;
                case 2:
                    action = ActionEnum.LOOK_ALL_CATEGORIES;
                    break;
                case 3:
                    action = ActionEnum.LOOK_BY_CATEGORY;
                    break;
                default:
                    break mainLoop;
            }

            switch (action) {
                case LOGIN:
                    login();
                    break;
                case LOOK_ALL_CATEGORIES:
                    System.out.println("All categories of products in shop:");
                    for (Category c : categories) {
                        System.out.println(c);
                    }
                    break;
                case LOOK_BY_CATEGORY:
                    System.out.println("Choose category: ");
                    for (int i = 1; i <= categories.length; i++) {
                        System.out.println(i + ") " + categories[i - 1]);
                    }
                    int chosenCategory = scanner.nextInt();
                    switch (chosenCategory) {
                        case 1 -> System.out.println(shop.filterByCategory(Category.ELECTRONICS));
                        case 2 -> System.out.println(shop.filterByCategory(Category.PLANTS));
                        case 3 -> System.out.println(shop.filterByCategory(Category.FOOD));
                        default -> System.out.println("Choose right option.");
                    }

            }


        }
    }

}

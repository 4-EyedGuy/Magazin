import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shop.Product> products = new ArrayList<>();
        products.add(new Shop.Product(2.5, 100, "MILK"));
        products.add(new Shop.Product(1.0, 50, "BREAD"));
        products.add(new Shop.Product(3.0, 200, "CHEESE"));

        Shop shop = new Shop(5, 10, products);
        System.out.println("=<| Shop |>=");
        System.out.println(shop);

        String[] categories = {"Products", "Tech", "Clothes"};
        Supermarket supermarket = new Supermarket(10, 20, products, 500, categories);
        System.out.println("\n=<| Supermarket |>=");
        System.out.println(supermarket);

        ArrayList<Shop.Product> emptyProducts = new ArrayList<>();
        Shop emptyShop = new Shop(2, 5, emptyProducts);
        System.out.println("\n=<| Empty Shop |>=");
        System.out.println(emptyShop);

        String[] emptyCategories = {};
        Supermarket emptySupermarket = new Supermarket(5, 10, emptyProducts, 200, emptyCategories);
        System.out.println("\n=<| Empty Supermarket |>=");
        System.out.println(emptySupermarket);

        try {
            Shop invalidShop = new Shop(0, 10, products);
            System.out.println("\n=<| Invalid Shop (0 cash registers) |>=");
            System.out.println(invalidShop);
        } catch (IllegalArgumentException e) {
            System.out.println("\n=<| Invalid Shop |>=");
            System.out.println("Error: " + e.getMessage());
        }


        Supermarket zeroAreaSupermarket = new Supermarket(5, 10, products, 0, categories);
        System.out.println("\n=<| Zero Area Supermarket |>=");
        System.out.println(zeroAreaSupermarket);
    }
}

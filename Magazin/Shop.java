import java.util.ArrayList;

public class Shop {
    private int numCashiers;
    private int numSellers;
    private ArrayList<Product> products;

    public static class Product {
        private double weight;
        private double price;
        private String name;

        public Product() {
            this.weight = 0.0;
            this.price = 0.0;
            this.name = "Unnamed Product";
        }

        public Product(double weight, double price, String name) {
            this.weight = weight;
            this.price = price;
            this.name = name;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name + " (Вес: " + weight + ", Цена: " + price + ")";
        }
    }

    public Shop() {
        this.numCashiers = 0;
        this.numSellers = 0;
        this.products = new ArrayList<>();
    }

    public Shop(int numCashiers, int numSellers, ArrayList<Product> products) {
        this.numCashiers = numCashiers;
        this.numSellers = numSellers;
        this.products = products;
    }

    public int getNumCashiers() {
        return numCashiers;
    }

    public void setNumCashiers(int numCashiers) {
        this.numCashiers = numCashiers;
    }

    public int getNumSellers() {
        return numSellers;
    }

    public void setNumSellers(int numSellers) {
        this.numSellers = numSellers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double calculateAverageWeight() {
        if (products.isEmpty()) return 0.0;
        double totalWeight = 0.0;
        for (Product product : products) {
            totalWeight += product.getWeight();
        }
        return totalWeight / products.size();
    }

    public double calculateCashierEfficiency() {
        if (numCashiers == 0) throw new IllegalArgumentException("Number of cashiers cannot be zero.");
        return (double) numSellers / numCashiers;
    }

    public double calculateEfficiency() {
        double avgWeight = calculateAverageWeight();
        double cashierEfficiency = calculateCashierEfficiency();
        return avgWeight * cashierEfficiency;
    }

    public String toString() {
        return "Shop:\n" +
                "Cashiers: " + numCashiers +
                ", Sellers: " + numSellers +
                ", Products: " + products +
                "\nEfficiency: " + calculateEfficiency();
    }
}

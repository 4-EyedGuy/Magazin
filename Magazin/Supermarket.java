public class Supermarket extends Shop {
    private double area;
    private String[] categories;

    public Supermarket() {
        super();
        this.area = 0.0;
        this.categories = new String[0];
    }

    public Supermarket(int numCashiers, int numSellers, ArrayList<Product> products, double area, String[] categories) {
        super(numCashiers, numSellers, products);
        this.area = area;
        this.categories = categories;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    @Override
    public double calculateEfficiency() {
        double cashierEfficiency = calculateCashierEfficiency();
        int categoryCount = categories.length;
        if (categoryCount == 0)
            return 0.0;
    }

    @Override
    public String toString() {
        String categoryList = categories.length > 0 ? String.join(", ", categories) : "No categories";
        return "Supermarket:\n" +
            "Area: " + area +
            ", Categories: " + categoryList +
            "\n" + super.toString();
    }

}

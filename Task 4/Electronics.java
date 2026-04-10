public class Electronics extends Product {
    int warranty;

    public Electronics(String name, double price, int quantity, int warranty) {
        super(name, price, quantity);
        this.warranty = warranty;
    }

    public String getWarrantyInfo() {
        return "Warranty: " + warranty + " years";
    }
}

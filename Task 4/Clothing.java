public class Clothing extends Product {
    String size;
    String material;

    public Clothing(String name, double price, int quantity, String size, String material) {
        super(name, price, quantity);
        this.size = size;
        this.material = material;
    }

    public String getClothingInfo() {
        return "Size: " + size + ", Material: " + material;
    }
}

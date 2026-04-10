public class Main {
    public static void main(String[] args) {
        Product genericProduct = new Product("Generic Product", 10.0, 100);
        System.out.println(genericProduct.getProductInfo());

        Electronics laptop = new Electronics("Laptop", 1500.0, 50, 2);
        System.out.println(laptop.getProductInfo());
        System.out.println(laptop.getWarrantyInfo());

        Clothing tShirt = new Clothing("T-Shirt", 25.0, 200, "M", "Cotton");
        System.out.println(tShirt.getProductInfo());
        System.out.println(tShirt.getClothingInfo());
    }
}

public class ProductManager {
    Product productName;
    public void Add(Product product) {
        this.productName = product;
        System.out.println("Ürün eklendi: " + product.getProductName());
    }

    public void Add2(double price, String productName, int unitsInStock) {

    }
}

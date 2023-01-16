public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        product.setProductName("Laptop");


        product.setPrice(5000);


        product.setUnitsInStock(5);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);



    }
}
public class Product {
    private String productName;
    private double price;
    private int unitsInStock;

    public int getUnitsInStock(){
        return unitsInStock;
    }
    public void setUnitsInStock(int unitsInStock){
        this.unitsInStock = unitsInStock;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

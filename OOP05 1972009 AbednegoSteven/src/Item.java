/**
 * @author AbednegoSteven - 1972009
 */
public abstract class Item {
    private String brand;
    private String name;
    private int price;

    public Item(){

    }
    public Item(String brand, String name, int price){
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

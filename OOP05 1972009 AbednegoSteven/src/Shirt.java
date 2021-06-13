/**
 * @author AbednegoSteven - 1972009
 */
public class Shirt extends Item{
    Size size;
    public Shirt(){

    }

    public enum Size{
        XS, S, M, L, XL, XXL
    }

    public Shirt(Size size, String brand, String name, int price) {
        super(brand, name, price);
        this.size =size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String toString(){
        String fs;
        fs = String.format("%20s %10s %10s",getName(),getSize(),getPrice());
        return fs;
    }
}

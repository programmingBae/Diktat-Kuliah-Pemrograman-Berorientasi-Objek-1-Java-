/**
 * @author AbednegoSteven - 1972009
 */
import java.util.ArrayList;
import java.util.List;

public class WareHouse {
    private List<Item> item;
    public WareHouse(){
        item = new ArrayList<>();
    }
    public void addItemToList(Item item){
        this.item.add(item);
    }
    public void showAllItemData(){
        if (item.isEmpty()){
            System.out.println("No Data");
        }else{
            item.forEach(Item ->{
                if (Item instanceof Shirt){
                    System.out.println(((Shirt)Item).toString());
                }
                else if (Item instanceof Shoe){
                    System.out.println(((Shoe)Item).toString());
                }
            });
        }
    }
}

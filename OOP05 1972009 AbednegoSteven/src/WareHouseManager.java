/**
 * @author AbednegoSteven - 1972009
 */
public class WareHouseManager {
    private WareHouse wareHouse;
    public WareHouseManager(WareHouse wareHouse){
        this.wareHouse = wareHouse;
    }
    public void addItemToWareHouse(Item item){
        wareHouse.addItemToList(item);
    }
    public void viewItemInWareHouse(){
        wareHouse.showAllItemData();
    }
}

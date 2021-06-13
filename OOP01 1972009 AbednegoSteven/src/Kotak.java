/*
Abednego Steven - 1972009
 */
public class Kotak {
    private int x,y,panjang,lebar;

    public void keAtas(int y){
        this.y += 1;
    }
    public void keBawah(int y){
        this.y -= 1;
    }
    public void keKanan(int x){
        this.x += 1;
    }
    public void keKiri(int x){
        this.x -= 1;
    }
}

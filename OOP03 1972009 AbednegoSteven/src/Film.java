/**
 * @author Abednego Steven - 1972009
 */
public class Film {
    private String title;
    private int duration;

    public Film(){

    }
    public Film(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

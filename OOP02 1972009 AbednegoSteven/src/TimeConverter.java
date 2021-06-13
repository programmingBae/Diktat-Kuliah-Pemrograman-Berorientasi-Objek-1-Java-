/**
 * @author Abednego Steven - 1972009
 */

public class TimeConverter {
    private int seconds;

    public TimeConverter(){

    }
    public TimeConverter(int second){
        this.seconds = second;
    }

    public int getSecond() {
        return seconds;
    }

    public void setSecond(int second) {
        this.seconds = second;
    }

    public String showTime(){
        int p1 = this.seconds % 60;
        int p2 = this.seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;

        String format1 = String.format("%02d", p1);
        String format2 = String.format("%02d", p2);
        String format3 = String.format("%02d", p3);


        return format2 + ":" + format3 + ":" + format1;
    }
}

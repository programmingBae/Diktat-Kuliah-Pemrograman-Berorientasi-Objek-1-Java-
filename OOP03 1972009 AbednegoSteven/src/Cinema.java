/**
 * @author Abednego Steven - 1972009
 */
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private int numberOfStudio = 10;
    Film [] films;


    public Cinema(){
       Film [] film = new Film[10];
       this.films=film;
    }

    public Film[] getFilms(){
        return films;
    }

    public int getNumberOfStudio() {
        return numberOfStudio;
    }

    public void setNumberofStudio() {
        this.numberOfStudio-=1;
    }



    public Film[] getLongestFilm(){
        Film []max=new Film[1];
        if (numberOfStudio==10){
            return null;
        }
        else{
            max[0]=films[0];
            for (int i=1; i<10;i++){
                if (films[i]!=null) {
                    if (max[0].getDuration() < films[i].getDuration()) {
                        max[0] = films[i];
                    }
                }
            }
            return max;
        }

    }

    public Film[] getShortestFilm(){
        Film [] min =new Film[1];
        if (numberOfStudio==10){
            return null;
        }
        else{
            min[0]=films[0];
            for (int i=1; i<10;i++){
                if (films[i]!=null) {
                    if (min[0].getDuration() > films[i].getDuration()) {
                        min[0] = films[i];
                    }
                }
            }
            }
            return min;
        }
    }


/**
 * @author Abednego Steven - 1972009
 */
public class Turtle {
    private String name;

    public Turtle(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void sparring(Panda panda){
        System.out.println("Come "+panda.getName()+". I will show you the dragon scroll");
        panda.setStrength(8);
        panda.setAgility(8);
        panda.setEnergy(8);

    }

}

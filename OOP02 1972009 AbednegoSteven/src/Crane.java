/**
 * Abednego Steven - 1972009
 */
public class Crane {
    private String name;

    public Crane(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sparring (Panda panda){
        System.out.println("Ok. Let's begin the training");
        panda.setStrength(3);
        panda.setEnergy(11);
    }
}

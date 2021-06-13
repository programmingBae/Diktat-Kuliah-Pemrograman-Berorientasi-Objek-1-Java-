/**
 * @author Abednego Steven - 1972009
 */

public class Snake {
    private String name;

    public Snake(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void sparring(Panda panda){
        System.out.println("Ok "+panda.getName()+". Are you ready?");
        panda.setStrength(8);
        panda.setEnergy(6);

    }

}

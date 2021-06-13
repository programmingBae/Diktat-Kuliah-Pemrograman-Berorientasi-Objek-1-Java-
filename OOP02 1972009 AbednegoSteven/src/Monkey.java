/**
 * @author Abednego Steven - 1972009
 */

public class Monkey {
    private String name;

    public Monkey(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sparring(Panda panda){
        System.out.println("So "+panda.getName()+". Let's get started");
        panda.setStrength(5);
        panda.setAgility(9);
    }
}

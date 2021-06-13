/**
 * @author Abednego Steven - 1972009
 */

public class Tiger {
    private String name;

    public Tiger(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void sparring(Panda panda){

        panda.setAgility(9);
        panda.setStrength(5);
        System.out.println("So you are ready to feel the pain.");


    }

}

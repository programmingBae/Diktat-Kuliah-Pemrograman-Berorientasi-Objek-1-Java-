/**
 * @author Abednego Steven - 1972009
 */


import java.util.Scanner;


public class PandaStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Panda panda = new Panda("Po");
        Tiger tigress = new Tiger ("Tigress");
        Grasshopper mantis = new Grasshopper("Mantis");
        Snake viper = new Snake("Viper");
        Monkey monkey = new Monkey("Monkey");
        Crane crane = new Crane("Crane");
        Turtle turtle = new Turtle("Turtle");
        System.out.print("Input days for  "+panda.getName()+" to train : ");
        int day = scanner.nextInt();
        for (int i = 1; i<=day; i++){
            System.out.println("Day "+i);
            System.out.println("1. Training with Tigress");
            System.out.println("2. Training with Mantis");
            System.out.println("3. Training with Viper");
            System.out.println("4. Training with Monkey");
            System.out.println("5. Training with Crane");
            System.out.print("Choose wisely : ");
            int pil = scanner.nextInt();
            // 10% chance probability
            if(new java.util.Random().nextInt(10)==0){
                //Do something.
                panda.training(turtle);
            }
            if (pil == 1){
                panda.training(tigress);
            }

            else if (pil == 2){
                panda.training(mantis);
            }

            else if (pil == 3){
                panda.training(viper);
            }

            else if (pil == 4){
                panda.training(monkey);
            }

            else if (pil == 5){
                panda.training(crane);
            }
        }
        panda.showMyStatus();
    }
}

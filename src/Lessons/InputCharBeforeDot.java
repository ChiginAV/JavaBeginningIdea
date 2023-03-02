package Lessons;

public class InputCharBeforeDot {

    public static void executeMe()
            throws java.io.IOException{

        char choice, ignore;

        System.out.println("Please input any char");
        System.out.println("Input . for quit");

        while(true){
            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (choice == '.') {
                System.out.println("Dot has been inputed. It's done");
                break;
            }
            else
                System.out.println(choice + " has been inputed");

        }



    }

}

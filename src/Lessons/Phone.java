package Lessons;

import java.io.IOException;

public class Phone {

    public static void executeMe(String[] args)
            throws IOException{

        String[][] numbers = {
                {"Alex", "11111"},
                {"Ben", "222222"},
                {"Cody", "333333"},
        };

        boolean entryFound = false;

        if (args.length != 1){
            System.out.println("Use: Java JavaBeginning <name>");
            return;
        }
        else{
            for (String[] numEntry: numbers){
                if (numEntry[0].equals(args[0])){
                    System.out.println(numEntry[0] + ": " + numEntry[1]);
                    entryFound = true;
                    break;
                }
            }
        }

        if (!entryFound)
            System.out.println("The name not found");

    }
}

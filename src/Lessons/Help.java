package Lessons;

import java.io.IOException;

public class Help {


    public static void executeMe()
            throws java.io.IOException{

        char choise;

        System.out.println("Help:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("Make a choise...");

        choise = (char) System.in.read();

        switch (choise) {
            case '1':
                System.out.println("1 - if");
                break;
            case '2':
                System.out.println("2 - switch");
                break;
            default:
                System.out.println("The querry not found");
        }

    }
}

package Lessons;

public class QueueDemo {

    public static void executeMe2() {

        // q1
        Queue q1 = new Queue(10); // Create empty queue for store 10 elements
        for (int i = 0; i < 10; i++) q1.put((char) ('A' + i)); // Put symbols into the queue

        // q2
        char[] name = {'T', 'o', 'm'}; // Create massive based queue
        Queue q2 = new Queue(name);

        // q3
        Queue q3 = new Queue(q1); // Create queue based of another queue

        // Display queues

        System.out.print("q1 contains: ");
        for (int i = 0; i < 10; i++) System.out.print(q1.get());
        System.out.println();

        System.out.print("q2 contains: ");
        for (int i = 0; i < 3; i++) System.out.print(q2.get());

        System.out.println();

        System.out.print("q3 contains: ");
        for (int i = 0; i < 10; i++) System.out.print(q3.get());

    }

    public static void executeMe1() {

        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        char ch;
        int i;

        // Input char symbols to bigQ
        System.out.println("Using bigQ for keeping alphabet");
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        // Extract and display char symbols from bigQ
        System.out.print("bigQ conteins: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");
        System.out.println("Using smallQ for generate errors");

        for (i = 0; i < 5; i++) {
            System.out.print("Trying to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // Extra errors while smallQ data accessing
        System.out.print("smallQ conteins: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

    }

}

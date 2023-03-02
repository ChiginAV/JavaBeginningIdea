package Lessons;

public class Queue {

    private char[] q;
    private int putLoc, getLoc;

    Queue(int size) {
        q = new char[size + 1];
        putLoc = getLoc = 0;
    }

    Queue(Queue obj) {
        putLoc = obj.putLoc;
        getLoc = obj.getLoc;

        q = new char[obj.q.length];

        // Copy queue elements
        for (int i = getLoc; i <= putLoc; i++)
            q[i] = obj.q[i];
    }

    Queue(char[] a){
        putLoc = 0;
        getLoc = 0;

        q = new char[a.length + 1];

        for (int i = 0; i < a.length; i++) put(a[i]);
    }

    public void put(char ch) {
        if (putLoc == q.length - 1) {
            System.out.println(" - The queue is full");
            return;
        }
        q[putLoc++] = ch;
    }

    public char get() {
        if (getLoc == putLoc) {
            System.out.println(" - The queue is empty");
            return (char) 0;
        }
        return q[getLoc++];
    }

}

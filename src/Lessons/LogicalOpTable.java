package Lessons;

public class LogicalOpTable {

    public static void executeMe() {

        /*boolean p, q;

        System.out.println(" P \t Q \t AN D \t OR \t X OR \t NOT ");

        p = true; q = true;
        System.out.print ( p + " \t " + q + " \t " );
        System.out.print ( ( p & q ) + " \t " + ( p | q ) + " \t " );
        System.out.println ( ( p ^ q ) + " \t " + ( ! p ) );

        p = true; q = false;
        System.out.print ( p + " \t " + q + " \t " ) ;
        System.out.print ( ( p & q ) + " \t " + ( p | q ) + " \t " ) ;
        System.out.println ( ( p ^ q ) + " \t " + ( ! p ) ) ;

        p = false; q = true;
        System.out.print ( p + " \t " + q + " \t " ) ;
        System.out.print ( ( p & q ) + " \t " + ( p | q ) + " \t " ) ;
        System.out.println ( ( p ^ q ) + " \t " + ( ! p ) ) ;

        p = false; q = false;
        System.out.print ( p + " \t " + q + " \t " ) ;
        System.out.print ( ( p & q ) + " \t " + ( p | q ) + " \t " ) ;
        System.out.println ( ( p ^ q ) + " \t " + ( ! p ) ) ;*/

        // Тоже самое, но вместо True/False выводится 1/0
        // Не так просто, как кажется на первый взгляд

        int p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = 1; q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (p^1));

        p = 1; q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (p^1));

        p = 0; q = 1;
        System.out.print(p + "\t" + q + "\t" );
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (p^1));

        p = 0; q = 0;
        System.out.print(p + "\t" + q + "\t" );
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (p^1));

    }
}

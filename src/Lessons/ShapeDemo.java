package Lessons;

public class ShapeDemo {

    public static void executeMe(){

        Shape[] shapes = new Shape[4];
        shapes[0] = new Shape.Triangle("bordered", 8.0, 12.0);
        shapes[1] = new Shape.Rectangle(10.0, 10.0);
        shapes[2] = new Shape.Rectangle(10.0,4.0);
        shapes[3] = new Shape.Triangle("filled", 7.0, 7.0);
        //shapes[4] = new Shape();

        for (Shape shape: shapes){
            System.out.println("Area is " + shape.area());
        }
        System.out.println();

        // Triangle 1

        Shape.Triangle t1 = new Shape.Triangle("filled", 4.0, 4.0); // Shape.Triangle because "Triangle" extends "Shape"

        System.out.println("t1 information:");
        t1.showStyle();
        t1.showDimention();
        System.out.println("Area is " + t1.area());
        System.out.println();

        // Triangle 2

        Shape.Triangle t2 = new Shape.Triangle("bordered", 8.0, 12.0);

        System.out.println("t2 information:");
        t2.showStyle();
        t2.showDimention();
        System.out.println("Area is " + t2.area());
        System.out.println();

        // Rectangle 1

        Shape.Rectangle r1 = new Shape.Rectangle(10.0, 10.0);

        System.out.println("r1 information:");
        r1.showDimention();
        System.out.println("Is it square - " + r1.isSquare());
        System.out.println("Area is " + r1.area());
        System.out.println();

        // Rectangle 2

        Shape.Rectangle r2 = new Shape.Rectangle(15.0, 10.0);

        System.out.println("r2 information:");
        r2.showDimention();
        System.out.println("Is it square - " + r2.isSquare());
        System.out.println("Area is " + r2.area());
        System.out.println();

    }

}

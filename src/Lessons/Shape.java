package Lessons;

abstract class Shape {

    private double width;
    private double height;

    Shape(){
        width = height = 0.0;
    }

    Shape(double width, double height){
        this.width = width;
        this.height = height;
    }

    double getWidth(){ return width; }
    double getHeight(){ return height; }

    void setWidth(double w){ width = w; }
    void setHeight(double h){ height = h; }

    public void showDimention(){
        System.out.println("Width is " + width + ", Height is " + height);
    }

    abstract double area();

    public static class Triangle extends Shape{
        private String style;

        Triangle(String style, double width, double height){
            super(width, height);

            this.style = style;
        }

        public double area(){
            return (getWidth() * getHeight() / 2);
        }

        void showStyle(){
            System.out.println("Triangle style is " + style);
        }

    }

    public static class Rectangle extends Shape{

        Rectangle(double width, double height){
           super(width, height);
        }

        boolean isSquare(){
            return (getWidth() == getHeight());
        }

        public double area(){
            return (getWidth() * getHeight());
        }
    }

}


public class CreateClassCircle {
    public static void main(String[] args) {

        Circle circle = new Circle();

        System.out.println("-----------------------------");
        System.out.println("------CHECK_INITIALIZE-------");
        System.out.println("-----------------------------\n");

        circle.initialize(5, 6, 7);
        System.out.println("CenterX: " + circle.centerX);
        System.out.println("CenterY: " + circle.centerY);
        System.out.println("Radius: " + circle.radius);
        System.out.println("Width: " + circle.width);
        System.out.println("Color: " + circle.color + "\n");

        circle.initialize(11, 34, 4, 1);
        System.out.println("CenterX: " + circle.centerX);
        System.out.println("CenterY: " + circle.centerY);
        System.out.println("Radius: " + circle.radius);
        System.out.println("Width: " + circle.width);
        System.out.println("Color: " + circle.color + "\n");

        circle.initialize(23, -4, 9, 2, "Blue");
        System.out.println("CenterX: " + circle.centerX);
        System.out.println("CenterY: " + circle.centerY);
        System.out.println("Radius: " + circle.radius);
        System.out.println("Width: " + circle.width);
        System.out.println("Color: " + circle.color + "\n");


    }
}

class Circle {
    public int      centerX;
    public int      centerY;
    public int      radius;
    public int      width;
    public String   color;

    public void initialize ( int centerX, int centerY, int radius ) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void initialize ( int centerX, int centerY, int radius, int width ) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public void initialize ( int centerX, int centerY, int radius, int width, String color ) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }


}
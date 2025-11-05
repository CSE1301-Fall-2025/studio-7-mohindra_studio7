import edu.princeton.cs.introcs.StdDraw;
public class Rectangle {
    private double width;
    private double height;
    private double perimeter;
    private double area;
    
    public Rectangle (double inWidth, double inHeight) {
        width = inWidth;
        height = inHeight;
        perimeter = (2.0 * width) + (2.0 * height);
        area = width * height;
    }
    
    public void print () {
        System.out.println ("Width: " + width);
        System.out.println ("Height: " + height);
        System.out.println ("Perimeter: " + perimeter);
        System.out.println ("Area: " + area);
    }

    public void draw () {
        StdDraw.setPenColor(0,0,0);
        StdDraw.rectangle(0.5, 0.5, (width * 0.5), (height * 0.5));
    }
    
    public static void isBigger (Rectangle r1, Rectangle r2) {
        if (r1.area > r2.area) {
            System.out.println( "r1 is bigger than r2");
        }
        else if (r1.area == r2.area) {
            System.out.println("r1 and r2 are the same size");
        }
        else {
            System.out.println("r1 is smaller than r2");
        }
    }
    
    public static void isSquare (Rectangle r1) {
        if (r1.width == r1.height) {
            System.out.println("Is a square");
        }
        else {
            System.out.println("Is not a square");
        }
    }

    public static void main (String[] args) {
        Rectangle r1 = new Rectangle(0.4, 0.2);
        Rectangle r2 = new Rectangle(0.3, 0.3);
        r1.print();
        r1.draw();
        System.out.println("");
        r2.print();
        r2.draw();
        System.out.println("");
        isBigger(r1,r2);
        isSquare(r1);
        isSquare(r2);
    }
}
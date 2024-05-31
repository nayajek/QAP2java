public class TestMyRectangle {
    
public static void main(String[] args) {
    // Test program to test all constructors and public methods
    // Construct a MyRectangle instance
    MyRectangle r1 = new MyRectangle(1, 5, 4, 1);
        System.out.println(r1);
        System.out.println("Area is: " + r1.getArea());
        System.out.println("Perimeter is: " + r1.getPerimeter());
        MyRectangle r2 = new MyRectangle(new MyPoint(0, 7), new MyPoint(3, 2));
        System.out.println(r2);
        System.out.println("Area is: " + r2.getArea());
        System.out.println("Perimeter is: " + r2.getPerimeter());
        System.out.println("Width is: " + r2.getWidth());
        System.out.println("Length is: " + r2.getLength());
    }
}

public class TesMyLine {
    
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        MyLine l1 = new MyLine(p1, p2);
        System.out.println(l1);
        System.out.println("Length is: " + l1.getLength());
        System.out.println("Gradient is: " + l1.getGradient());
        MyPoint p3 = new MyPoint(0, 0);
        MyPoint p4 = new MyPoint(1, 1);
        MyLine l2 = new MyLine(p3, p4);
        System.out.println(l2);
        System.out.println("Length is: " + l2.getLength());
        System.out.println("Gradient is: " + l2.getGradient());
    }
}
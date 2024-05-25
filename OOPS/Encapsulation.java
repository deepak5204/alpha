package OOPS;

public class Encapsulation {

    public static void main(String[] args) {

        RectangleArea ra = new RectangleArea();
        int area = ra.calculateArea(2, 4);
        System.out.println(area);

    }
}

class RectangleArea {

    public static int calculateArea(int a, int b) {
        return a * b;
    }
}

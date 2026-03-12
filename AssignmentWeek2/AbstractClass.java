package AssignmentWeek2;
abstract class Shape {
    abstract void area();
}
class Circle extends Shape {
    double r = 5;

    void area() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}
class Rectangle extends Shape {
    int l = 4, b = 6;
    void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.area();
        r.area();
    }
}
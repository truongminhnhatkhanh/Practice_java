public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }

    public Circle(double r, String Color) {
        this.radius = r;
        this.color = Color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius2) {
        this.radius = radius2;
    }

    public void setColor(String color2) {
        this.color = color2;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Area of circle 1=" + c1.getArea());
        Circle c2 = new Circle(5.0);
        System.out.println(c2);
        System.out.println("Area of circle 2=" + c2.getArea());
        Circle c3 = new Circle(7.0, "green");
        System.out.println(c3);
        System.out.println("Area of circle 3=" + c3.getArea());
    }
}


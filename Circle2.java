package bai1;

public class Circle2 {
        private double radius;

        public Circle2() {
        }

        public Circle2(double radius) {
                this.radius = radius;
        }

        public double getRadius() {
                return radius;
        }

        public void setRadius(double radius) {
                this.radius = radius;
        }

        public double getArea() {
                return Math.PI * radius * radius;
        }

        public double getPerimeter() {
                return 2 * Math.PI * radius;
        }

        public String toString() {
                return "Circle1: " + radius + " " + getArea() + " " + getPerimeter();
        }
}

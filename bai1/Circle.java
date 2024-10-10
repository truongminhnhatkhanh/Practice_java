package bai1;

public class Circle {
    private double radius =1.0;
    private String color = "red";

    public Circle(){
    }
    public Circle(double radius){
        radius = 1.0;
    }
    public Circle(double radius, String color){
        radius = 1.0;
        color = "red";
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return "Circle[radius= " + radius + ",color=  " + color +" with Area= " + getArea() + "]";
    }
    public double getArea(){
        return radius * radius*Math.PI;
    }
}

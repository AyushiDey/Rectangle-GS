package com.thoughtworks.rectangle;

public class Rectangle {
    private final double length;
    private final double breadth;
    public Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public double area() {
        return (this.length*this.breadth);
    }
    
    public double perimeter(){
        return 2*(this.length+this.breadth);
    }
}

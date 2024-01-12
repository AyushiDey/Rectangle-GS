package com.thoughtworks.rectangle;

public class Rectangle {
    public int length;
    public int breadth;
    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int area() {
        return (this.length*this.breadth);
    }
    
}

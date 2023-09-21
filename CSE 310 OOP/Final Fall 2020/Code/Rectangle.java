package shapedemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Rectangle extends ShapeDemo implements Shape {
    double b,h;
    public Rectangle(double b, double h){
        this.b = b;
        this.h = h;
    }
    @Override
    public double getArea(){
        double area = b*h;
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = 2*(b+h);
        
        return perimeter;
    }
    @Override
    public String toString(){
        return "Rectangle";
    }
    
}
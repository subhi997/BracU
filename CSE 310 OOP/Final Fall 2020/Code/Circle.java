package shapedemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yokko
 */

public class Circle extends ShapeDemo implements Shape {
    double r;
    
    public Circle(double r){
        this.r = r;
    }
    @Override
    public double getArea(){
        double area = Math.PI*r*r;
        
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = 2*Math.PI*r;
        
        return perimeter;
    }
    
    @Override
    public String toString(){
        return "Circle";
    }
}

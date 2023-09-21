/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapedemo;

/**
 *
 * @author yokko
 */
public class Square extends ShapeDemo implements Shape {
    double a;
    
    public Square(double a){
        this.a = a;
    }
    @Override
    public double getArea(){
        double area = a*a;
        
        return area;
    }
    @Override
    public String toString(){
        return "Square";
    }
    @Override
    public double getPerimeter(){
        double perimeter = 4*a;
        
        return perimeter;
    }
    
}
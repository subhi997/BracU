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
abstract class ShapeFactory implements Shape {
    
    public static Shape getInstance(String s , double a){
        Circle cir = new Circle(a);
        return cir;
    }
    
    public static Shape getInstance(String s , int a, int b){
        Rectangle rec = new Rectangle(a,b);
        return rec;
    }
     
     public static Shape getInstance(String s , int a){
        Square sq = new Square(a);
        return sq;
    }
    
}

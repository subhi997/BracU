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
public class ShapePrinter  {

    public static void print(Shape shape) {
        System.out.println("Shape: " + shape);
        System.out.println("AREA: " + shape.getArea());
        System.out.println("PERIMETER: " + shape.getPerimeter());
        System.out.println();
    }
}

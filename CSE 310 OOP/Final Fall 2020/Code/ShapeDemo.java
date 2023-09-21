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
public class ShapeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape c = ShapeFactory.getInstance("c",5.0);
        Shape r = ShapeFactory.getInstance("r",3,4);
        Shape s = ShapeFactory.getInstance("s",6);
  
        ShapePrinter.print(c);
        ShapePrinter.print(r);
        ShapePrinter.print(s);
    }
    
}

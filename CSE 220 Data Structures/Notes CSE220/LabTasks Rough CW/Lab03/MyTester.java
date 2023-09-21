public class MyTester{
  public static void main(String [] args){
    
    Object [] linear = {10, 20, 30, 40, null};
    
    System.out.println("\n///// TEST 05 /////");
    Object [] linear3 = {10, 20, 30, 40, 50};
    CircularArraySHIFT c4 = new CircularArraySHIFT(linear3, 2, 5);
    c4.printFullLinear(); // This Should Print: 40, 50, 10, 20, 30.
    c4.insertByRightShift(80, 2); //parameter--> elem, pos. pos --> position relative to start.
                               // Valid range of pos--> 0 to size
                               // Increase array length by 3 if size==cir.length
                               // use resizeStartUnchanged() for resizing.
    c4.printFullLinear(); // This Should Print: null, null, 10, 20, 80, 30, 40, 50.
  }
}
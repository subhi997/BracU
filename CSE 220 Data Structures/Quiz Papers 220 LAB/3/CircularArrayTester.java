public class CircularArrayTester{
  public static void main(String [] args){
    Object [] linear = {10, 20, 30, 40, 50, 60, null, null};
    CircularArray c = new CircularArray(linear, 2,6);
    c.printForward();// 10, 20, 30, 40, 50, 60.
    c.insert(70);
    c.printForward();// 10, 20, 30, 40, 50, 60, 70.
    c.remove();
    c.printForward();// 10, 20, 30, 40, 50, 60.
    c.insert(15);
    c.printForward();// 10, 20, 30, 40, 50, 60, 15.
    c.remove();
    c.printForward();// 10, 20, 30, 40, 50, 60.
    c.remove();
    c.printForward();// 10, 20, 30, 40, 50.
  }
}
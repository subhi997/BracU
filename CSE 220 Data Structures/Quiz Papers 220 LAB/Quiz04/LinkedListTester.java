public class LinkedListTester{
  public static void main(String [] args){
    
    System.out.println("\n/////  Test 01  /////");
    Object [] a1 = {10,20,30,40};
    LinkedList h1 = new LinkedList(a1); // Creates a linked list using the values from the array
    // head will refer to the Node that contains the element from a[0]
    h1.printList(); // This should print: 10,20,30,40.
    
// inserts Node containing the given element at the given index. Check validity of index.
    h1.insert(85);// This should print: 10,20,30,40,85. 10,20,30,40,85. 
    h1.insert(35); // This should print: 10,20,30,35,40,80. 10,20,30,35,80. 
    h1.insert(10);// This should print: 10,10,20,30,35,80. 10,10,30,35,80.
    
      
    
    
  }
  
}
public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a sorted linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    head=new Node(a[0],null);
    Node tail=head;
    for(int i=1;i<a.length;i++){
      Node n=new Node(a[i],null);
      tail.next=n;
      tail=n;
    }
  }

  
  /* prints the elements in the list */
  public void printList(){
    for(Node n=head;n!=null;n=n.next){
      if(n.next!=null)
        System.out.print(n.element+", ");
      else
        System.out.print(n.element+".");
    }
  }
  
  /* inserts Node containing the given element in the sorted Linked List
   * Once inserted the immediate node that follows will be deleted
   * Check validity of index.
   */
  public void insert(Object elem){
    // TO DO
  }
  
  

  
}
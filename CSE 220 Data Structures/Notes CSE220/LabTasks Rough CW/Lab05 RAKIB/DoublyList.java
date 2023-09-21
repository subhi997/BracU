public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        // TO DO
      int count=0;
      Node tail=head.next;
      while(tail!=head){
        tail=tail.next;
      count++;}
        
        return count; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        // TO DO   
      Node tail=head.next;
      while(tail!=head){
      System.out.print(tail.element+" ");
      tail=tail.next;
      }
      System.out.println();
      
      
    }
    
    public void backwardprint(){
        // TO DO     
      Node tail=head.prev;
      while(tail!=head){
      System.out.print(tail.element+" ");
      tail=tail.prev;}
      System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        // TO DO
      Node tail=head.next;
      int count=0;
      while(count<idx){
      tail=tail.next;
      count++;}
    
        
        return tail; // please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        // TO DO
      int count=0;
      Node tail=head.next;
      while(tail!=head){
        if(elem==tail.element){
          return count;
        }
        else{
        tail=tail.next;
        count++;}
      }
       
        
        
        
        return -1; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
      // TO DO
      Node tail=head.next;
      int count=countNode();
      Node e=new Node(elem, null, null);
      if(idx==0){
        e.next=tail;
        e.prev=head;
        head.next=e;
        tail.prev=e;}
      else if(idx<=count){
        
        
        for(int measure=1;measure<idx;measure++){
          tail=tail.next;
        }e.next=tail.next;
        e.prev=tail;
        tail.next=e;
        tail.next.prev=e;
      }else if(idx==count+1){
        while(tail.next!=head){
          tail=tail.next;
        }
          e.next=head;
          tail.next=e;
          e.prev=tail;
          head.prev=e;
          
        }
      }
    
    
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        // TO DO
        Node tail=nodeAt(index);
       tail.prev.next=tail.next;
      tail.next.prev=tail.prev;
      
      
        
        
        return tail.element; // please remove this line!
    }
    
    
    
}
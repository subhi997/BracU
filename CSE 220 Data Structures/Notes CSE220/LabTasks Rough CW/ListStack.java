public class ListStack implements Stack{
  int size;
  Node top;
  
  
  public ListStack(){
    size = 0;
    top = null;
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    if(size==0){
      return true;
    }
    else{
      return false;
    }
  }
  public void push(Object e) throws StackOverflowException{
    
    Node n=new Node(e,null);
    n.next=top;
    top=n;
    ++size;
  }
  public Object pop() throws StackUnderflowException{
    if(size==0){
      throw new StackUnderflowException();
    }
    else{
    Object a=top.val;
    top=top.next;
    --size;
    return a;
    }
  }
  public Object peek() throws StackUnderflowException{
    if(size==0){
      throw new StackUnderflowException();
    }
    return top.val; 
  }
  public String toString(){
    String a=" ";
    if(size==0){
     return "Empty Stack";
    }
    else{
    for(Node i=top;i!=null;i=i.next){
      a+=i.val+" ";
    }
    }
    return a;
  }
  
  
  public int search(Object e){
    int count=0;
    for(Node i=top;i!=null;i=i.next){
      if(i.val==e){
        return count;
      }
      else{
        ++count;
      }
    }
    return -1;
    
  }
  public Object[] toArray(){
    Object a[]=new Object[size];
    Node k=top;
    for(int i=0;i<size;++i){
      a[i]=k.val;
      k=k.next;
      
    }
    return a;
  }
  
  
}
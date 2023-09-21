public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
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
      if(size==data.length){
        throw new StackOverflowException();
      }
      else{
      data[size]=e;
      }
      ++size;
    }
    public Object pop() throws StackUnderflowException{
      if(size==0){
        throw new StackUnderflowException();
      }
      else{
        Object a=data[size-1];
        data[size-1]=null;
        size-=1;
        return a;
      }
    }
    public Object peek() throws StackUnderflowException{
      if(size==0){
        throw new StackUnderflowException();
      }
      return data[size-1];
    }
    public String toString(){
      if(size==0){
        return "Empty Stack";
      }
      String a=" ";
      for(int i=size-1;i>=0;--i){
        a+=data[i]+" ";
      }
      return a;
    }
        
    public int search(Object e){
      int count=0;
      for(int i=size-1;i>=0;--i){
        if(data[i]==e){
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
      int k=size-1;
      for(int i=0;i<size;++i){
        a[i]=data[k];
        --k;
      }
      return a;
    }

    
}
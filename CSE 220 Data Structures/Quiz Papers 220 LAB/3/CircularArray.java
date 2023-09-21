public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    cir=new Object[lin.length];
    start=st;
    size=sz;
    for(int i=0;i<lin.length;i++){
      cir[st]=lin[i];
      st=(st+1)%cir.length;
    }
  }

  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    for(int i=0, s=start; i<size;i++,s=(s+1)%cir.length){
      if(i==size-1)
        System.out.println(cir[s]+".");
      else
        System.out.print(cir[s]+", ");
    }
  }
  
  public void insert (Object o){
    //TODO
  }
  public void remove (){
    //TODO
  }
  
}
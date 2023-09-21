public class CircularArraySHIFT{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArraySHIFT(Object [] lin, int st, int sz){
    start = st;
    size = sz;
    cir = new Object[lin.length];
    int k = start;
    for(int i=0; i<size ; i++){
      cir[k] = lin[i];
      k = (k+1)%cir.length;
    }
  }
  
//Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
    for(int i=0 ; i<=cir.length-1 ; i++){
      if(i==cir.length-1){
        System.out.print(cir[i]+".");
      }else{
        System.out.print(cir[i]+",");
      }
    }
    System.out.println();
  }
  public void resizeStartUnchanged(int newcapacity){
    Object[] resizedArr = new Object[newcapacity];
    int k = start;
    int m = start;
    for(int i=0 ; i<size; i++){
      resizedArr[m] = cir[k];
      k=(k+1)%cir.length;
      m=(m+1)%resizedArr.length;
    }
    cir = resizedArr;
  }
  public void insertByRightShift(Object elem, int pos){
    if(size == cir.length){
      resizeStartUnchanged(size + 3);
      
      
      // Find the number of elements to shift
      int nShifts = size - pos;
      
      int from = (start + size - 1) % cir.length;
      int to = (from + 1) % cir.length;
      
      for (int i = 0; i < nShifts; i++) {
        cir[to] = cir[from];
// move to and from backwards.
        to = from;
        from = from - 1;
        if (from < 0)
          from = cir.length;
      }
      
      int insertPos = (start + pos) % cir.length;
      cir[insertPos] = elem;
      
    }
    
  }
}
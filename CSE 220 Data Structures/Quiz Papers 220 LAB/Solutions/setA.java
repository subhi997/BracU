import java.util.Scanner;
public class setA{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int a[] = new int[]{1,2,3,2,5,2};
    
    System.out.println("Enter a value");
    int n = sc.nextInt();
    
    DesignSetA obj = new DesignSetA();
    int b[] = (obj.notAlone(a,n));
    
    System.out.print("{");
    for(int i=0; i<b.length; i++){
      if(i!=b.length-1){
        System.out.print(b[i]+",");
      }else{
        System.out.print(b[i]);
      }
    }
    System.out.print("}");
  }
}
    

import java.util.Scanner;
public class Task01{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length");
    int num = sc.nextInt();
    
    int [] a = new int [num];
    
    for(int i=0 ; i<a.length ; i++){
      System.out.println("Enter a number");
      a[i] = sc.nextInt();
    }
    firstLast6 n = new firstLast6();
    System.out.println(n.methodA(a));
  }
}
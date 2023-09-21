import java.util.Scanner;
public class task4{
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int [] a = new int [10];
    System.out.println("Enter a number");
    a[0]=sc.nextInt();
    
    for(int i=1;i<a.length;i++){
      System.out.println("Enter a number");
      a[i]=sc.nextInt();
      if(a[i]==a[i-1]) {
        System.out.println(a[i]+" already exists.Try another number.");
        i--;
      }
    }
  }
}

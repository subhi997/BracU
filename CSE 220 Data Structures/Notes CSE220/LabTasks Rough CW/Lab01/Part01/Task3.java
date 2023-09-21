import java.util.Scanner;
public class Task3{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int [] a = new int [5];
    
    for(int i=0 ; i<a.length ; i++){
      System.out.println("Enter a number");
      a[i] = sc.nextInt();
    }
    for(int i=0;i<a.length;i++){
      for(int j=i+1; j<a.length;j++){
        if(a[j]>a[i]){
          int temp = a[j];
          a[j]=a[i];
          a[i]=temp;
        }
      }
    }
    for(int x=0;x<a.length;x++){
      System.out.print(a[x]+",");
    }
    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
      System.out.print(a[i]+",");
      }
    }
  }
}
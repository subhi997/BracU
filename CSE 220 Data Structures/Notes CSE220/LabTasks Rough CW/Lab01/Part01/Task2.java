import java.util.Scanner;
public class Task2{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int [] a = new int [10];
    
    for(int i=0 ; i<a.length ; i++){
      System.out.println("Enter a number");
      a[i] = sc.nextInt();
    }
    int max=a[0],min=a[0],maxLoc=0,minLoc=0;
    for(int j=1;j<a.length;j++){
      if(a[j]>max){
        max=a[j];
        maxLoc=j;
      }
      if(a[j]<min){
        min=a[j];
        minLoc=j;
      }
    }
    int temp = a[maxLoc];
    a[maxLoc]=a[minLoc];
    a[minLoc]=temp;
    for(int x=0;x<a.length;x++){
      System.out.print(a[x]+",");
    }
  }
}
      
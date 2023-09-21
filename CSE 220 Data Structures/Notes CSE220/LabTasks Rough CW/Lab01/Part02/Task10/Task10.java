import java.util.Scanner;
public class Task10{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int [] a ={1,4,8,16,25,36,49,64,81,100};
    System.out.println("Enter a numShift");
    int n = sc.nextInt();
    int count1=0;
    
    System.out.print("Left Rotate: ");
    for(int j=n;j<=a.length;j++){
      if(count1<a.length){
        if(j==a.length){
          j=-1;
        }
        else{
          ++count1;
          System.out.print(a[j]+",");
        }
      }
    }
    System.out.println();
    System.out.print("Right Rotate: ");
    int count2=0;
    for(int j=a.length-n;j<=a.length;j++){
      if(count2<a.length){
        if(j==a.length){
          j=-1;
        }
        else{
          ++count2;
          System.out.print(a[j]+",");
        }
      }
    }
  }
}
    
import java.util.Scanner;
public class Task10{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a month no. between 1 and 12");
    int month = sc.nextInt();
    System.out.println("Enter a day no. between 1 and 31");
    int day = sc.nextInt();
    
    DesignTask10 obj = new DesignTask10();
    System.out.println(obj.season(month,day));
  }
}

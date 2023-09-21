import java.util.Scanner;
public class Task11 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = sc.nextInt();
      
       
        DesignTask11 d = new DesignTask11();
        System.out.println(d.allDigitsOdd(n));
    }
}
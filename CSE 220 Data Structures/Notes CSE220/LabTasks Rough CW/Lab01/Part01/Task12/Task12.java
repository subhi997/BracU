import java.util.Scanner;
public class Task12{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
         
    System.out.println("Enter a month no. between 1 and 12");
    int m1 = sc.nextInt();
    System.out.println("Enter a day no. between 1 and 31");
    int d1 = sc.nextInt();
       
    System.out.println("Enter a month no. between 1 and 12");
    int m2 = sc.nextInt();
    System.out.println("Enter a day no. between 1 and 31");
    int d2 = sc.nextInt();
        
        DesignTask12 d = new DesignTask12();
        System.out.println(d.before(m1,d1,m2,d2));
    }
}

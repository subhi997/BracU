import java.util.Scanner;
public class Task09{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a num for i,j,k respectively.");
    int i = sc.nextInt();
    int j = sc.nextInt();
    int k = sc.nextInt();
    QuadEqn q = new QuadEqn(i,j,k);
    System.out.println(q.getEqn());
    System.out.println(q.getRoot());
  }
}
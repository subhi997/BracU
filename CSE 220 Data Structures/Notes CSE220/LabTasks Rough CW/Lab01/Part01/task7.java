import java.util.Scanner;
public class task7{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [10];
        System.out.println("Enter 10 numbers");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a number between 0 to 9");
        int b=sc.nextInt();
        for (int i=0;i<a[b];i++){
            System.out.print("*");
        }
    }
}
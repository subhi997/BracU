import java.util.Scanner;
public class task6{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);       
        System.out.println("Enter a number of digits");        
        int num =sc.nextInt();
        int [] a = new int [num];

        System.out.println("Enter digits");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        if (a[0]==a[a.length-1]){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It's not a palindrome");
        }
    }
}









import java.util.Scanner;
public class task5{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int [] a = new int [15];
        int [] counter = new int [10];
        int count=0;
        System.out.println("Please enter a number between 0 to 9");
        for(int i=0;i<a.length;i++){
            count=sc.nextInt();
            a[count]++;
        }
        for (int i=0; i<counter.length; i++) {
            System.out.println(i+" was found "+a[i]+" times.");
        }
    }
}

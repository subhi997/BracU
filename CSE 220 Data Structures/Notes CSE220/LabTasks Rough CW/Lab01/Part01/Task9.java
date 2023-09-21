import java.util.Scanner;
public class Task9{
    public static void square(int[] a, int length) {
        for (int i=0; i<=length-1; i++) {
            a[i]=a[i]*a[i];
        }
    }
    public static void print(int[] a, int length) {
        for (int i=0;i<=a.length-1;i++){
        System.out.print(a[i] +",");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i=0; i<=a.length-1; i++) {
            System.out.println("Enter a number");
            a[i]=sc.nextInt();
        }
        square(a,a.length);
        print(a,a.length);
    }
}
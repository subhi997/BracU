import java.util.Scanner;
public class task8{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions/size of two row matrices");
        int size=sc.nextInt();
        int [] A = new int [size];
        int [] B = new int [size];
        int [] C = new int [size];
        
        for (int i=0; i<=A.length-1; i++){
            System.out.println("Enter number for A"+i+" position");
            A[i]=sc.nextInt();
        } 
         for (int i=0; i<=B.length-1; i++){
            System.out.println("Enter number for B"+i+" position ");
            B[i]=sc.nextInt();
        } 
         for (int i=0;i<=C.length-1;i++){
             C[i]=(A[i]*5)-B[i];
         }
         for(int i=0;i<=C.length-1;i++){
         System.out.print(C[i]+",");
         }
    }
}
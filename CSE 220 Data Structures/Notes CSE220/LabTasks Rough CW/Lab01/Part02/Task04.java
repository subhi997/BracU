import java.util.Scanner;
public class Task04{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x,n=sc.nextInt();
        try{
            int a[]=new int[n];
            a[5]=99;
            x=n/0;
        }
        catch(ArithmeticException e){
          System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
          System.out.println(e);
        } 
        catch(Exception e){
          System.out.println(e);
        }        
        finally{
            System.out.println("THE END");
        }
    }
}
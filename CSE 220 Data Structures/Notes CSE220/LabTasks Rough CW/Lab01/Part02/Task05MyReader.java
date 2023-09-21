import java.util.Scanner;
public class Task05MyReader{
  static int readInteger()throws EitaIntegerNoiException{
    Scanner sc = new Scanner(System.in);
      int answer;
      String s = sc.nextLine();
      
      if(s.contains(".")){
        throw new EitaIntegerNoiException();
      }
      else{
        answer=Integer.parseInt(s);
        return answer'
      }
  }
}
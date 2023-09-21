public class Main{
  public static void main(String[]args){
    BankAccount acc1 = new BankAccount("Subhi","17201116","Banani",7000.0);
    BankAccount acc2 = new BankAccount("Saqib","18201818","Gulshan",87.54);
    BankAccount acc3 = new BankAccount("Aashra","17321110","Baridhara",1000.0);
    
    acc1.addInterest();
    acc3.addInterest();
    
    printDetails(acc1);
    printDetails(acc2);
    printDetails(acc3);
    
    
    public static void printDetails(BankAccount s){
      System.out.println("Name : "+s.getName());   
      System.out.println("Address : "+s.getAddress());    
      System.out.println("AccountID : "+s.getAccountID());
      System.out.println("Balance : "+s.getBalance());
    }
  }
}


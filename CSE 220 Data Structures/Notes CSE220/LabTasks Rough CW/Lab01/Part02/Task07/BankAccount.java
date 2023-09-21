public class BankAccount{
  private String name="";
  private String address="";
  private String accountID="";
  private double balance=0.0;
  
  public BankAccount(){
  }
  public BankAccount(String n,String a,String i,double b){
  name = n;
  address = a;
  accountID = i;
  balance = b;
  }
  public String getName(){
    return name;
  }
  public String getAccountID(){
    return accountID;
  }
  public String getAddress(){
    return address;
  }
  
  public double getBalance(){
    return balance;
  }
  public void addInterest(){
    balance+=0.07*balance;
  }//adds 7% of the balance
}
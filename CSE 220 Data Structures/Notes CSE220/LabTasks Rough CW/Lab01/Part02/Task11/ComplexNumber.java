public class ComplexNumber extends RealNumber{
  private double complexValue;
  public ComplexNumber(){    
    super(1.0);
    complexValue=1.0;
  }
  public ComplexNumber(double x,double y){
    super(x);
    complexValue=y;
  }
  
  public String toString(){
    System.out.println(super.toString());
    return "ImaginaryPart: "+getComplexValue();
  }
  public double getComplexValue() {
    return complexValue;
  }
  public void ping() {
    System.out.println("I'm in ComplexNumber class");
  }
  public void check(){
    ping();
    super.ping();
    System.out.println("Checking Ended.");
  }
}

public class QuadEqn{
  public int a,b,c;
  double root1,root2;
  
  QuadEqn(int a,int b,int c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  String getEqn(){
    String eqn = a+"x^2";
    if(b>0){
      eqn+="+"+b+"x";
    }
    else if(b<0){
      eqn+=b+"x";
    }
    if(c>0){
      eqn+="+"+c;
    }
    if(c<0){
      eqn+=c;
    }
    return eqn;
  }
  double getRoot(){
    double d = b*b-4*a*c;
    if(d>0){
      root1=(-b+Math.sqrt(d))/(2*a);
      root2=(-b-Math.sqrt(d))/(2*a);
      
      if(root1>=0){
        return root1;
      }
      else{
        return root2;
      }
    }
    else{
      System.out.println("No real roots");
      return 0.0;
    }
  }
}
    
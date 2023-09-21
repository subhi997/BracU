public class Square{
  private double height=0.0;
  private double width=0.0;
  
  public Square(){
  }
  public void setHeight(double h){
    height = h;
  }
  public double getHeight(){
    return height;
  }
  public void setWidth (double w){
    width = w;
  }
  public double getWidth (){
    return width;
  }
  public double getArea (){
    return height*width;
  }
}

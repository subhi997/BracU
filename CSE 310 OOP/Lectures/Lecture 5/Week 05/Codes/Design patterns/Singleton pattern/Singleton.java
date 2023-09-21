// Classical Java implementation of singleton 
// design pattern
//Lazy instantiation
class Singleton
{
    private static Singleton obj;
 
    // private constructor to force use of
    // getInstance() to create Singleton object
    private Singleton() {}
 
    public static Singleton getInstance()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }
    
    public void showMessage()
    {
      System.out.println("It is a singleton demo");
    }
}

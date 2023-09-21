// Double Checked Locking based Java implementation of
// singleton design pattern
//Double checked locking
class SingletonWithDoubleChecking
{
    private volatile static SingletonWithDoubleChecking obj;
 
    private SingletonWithDoubleChecking() {}
 
    public static SingletonWithDoubleChecking getInstance()
    {
        if (obj == null)
        {
            // To make thread safe
            synchronized (SingletonWithDoubleChecking.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj==null)
                    obj = new SingletonWithDoubleChecking();
            }
        }
        return obj;
    }
}
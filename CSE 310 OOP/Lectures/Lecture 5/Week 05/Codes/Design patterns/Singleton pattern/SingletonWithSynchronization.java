// Thread Synchronized Java implementation of 
// singleton design pattern
class SingletonWithSynchronization
{
    private static SingletonWithSynchronization obj;
 
    private SingletonWithSynchronization() {}
 
    // Only one thread can execute this at a time
    public static synchronized SingletonWithSynchronization getInstance()
    {
        if (obj==null)
            obj = new SingletonWithSynchronization();
        return obj;
    }
}

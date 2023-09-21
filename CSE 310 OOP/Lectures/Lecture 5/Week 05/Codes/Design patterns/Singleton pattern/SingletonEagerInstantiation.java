// Static initializer based Java implementation of
// singleton design pattern
//Eager instantiation
class SingletonEagerInstantiation
{
    private static SingletonEagerInstantiation obj = new SingletonEagerInstantiation();
 
    private SingletonEagerInstantiation() {}
 
    public static SingletonEagerInstantiation getInstance()
    {
        return obj;
    }
}

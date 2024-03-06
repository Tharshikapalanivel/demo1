package demo;

public class SingletonLazy
{
    public static void main(String[] args)
    {
        A obj1=A.getObject();
        A obj2=A.getObject();
    }

}
class A {
    static A obj;
    private A(){
        System.out.println("new instance created");
    }
    public static A getObject()
    {
        if (obj==null)       //lazy instance creation
        {
            obj=new A();
        }
        return obj;
    }
}

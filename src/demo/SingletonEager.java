package demo;

public class SingletonEager {
    public static void main(String[] args)
    {
       // Abc ob=new Abc();   //throws error becoz of private constructor
       Abc obj1=Abc.getObject();
       Abc obj2=Abc.getObject();//same instance is only used

    }
}
class Abc
{
    static Abc obj =new Abc(); //by default it is Eager instance creation i.e even if we not using that object
                                //it will be there in memory
    private Abc()  //private constructor so that we cant create [new Abc() ] object outside the class
    {
        System.out.println("instance created");
    }
    public static Abc getObject(){
        return obj;
    }
}
/* 1.create static instance
   2.create private constructor
   3.create static method
 */
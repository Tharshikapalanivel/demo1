package demo;

public class DobleCheckLocking {
    public static void main(String[] args)
    {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                A2 obj1= A2.getObject();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                A2 obj2= A2.getObject();
            }
        });
        t1.start();
        t2.start();
    }
}
class A2 {
    static A2 obj;
    private A2(){
        System.out.println("new instance created");
    }
    public static  A2 getObject()
    {
        // double checking ie check if obj==null inside the synchronized class .it does not take that much
        // execution time as synchronized method
        if (obj==null)
        {
          synchronized (A2.class)
          {
             if(obj==null)
             {
                 obj=new A2();
             }
          }
        }
        return obj;
    }
}

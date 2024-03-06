package demo;

public class Synchronized
{
        public static void main(String[] args)
        {
            Thread t1=new Thread(new Runnable() {
                @Override
                public void run() {
                    A1 obj1= A1.getObject();
                }
            });
            Thread t2=new Thread(new Runnable() {
                @Override
                public void run() {
                    A1 obj2= A1.getObject();
                }
            });
            t1.start();
//            try{
//                Thread.sleep(10);
//            }
//            catch (Exception e){}
            t2.start();
        }

    }
    class A1 {
        static A1 obj;
        private A1(){
            System.out.println("new instance created");
        }
        public static synchronized A1 getObject()      //synchronized makes obj creation at one time
                // but disadv is synchronise will increase execution time
        {
            if (obj==null)
            {
                obj=new A1();
            }
            return obj;
        }
    }




package demo;

public class Enum
{
    public static void main(String[] args)
    {
        A3 obj1=A3.INSTANCE;
        obj1.i=5;
        obj1.show();

        A3 obj2=A3.INSTANCE;
        obj2.i=10;
        obj2.show();
    }

}
enum A3 // special type of class ie it has private constructor already
{
   INSTANCE;
   int i;
   public void show(){
       System.out.println(i);
   }
}

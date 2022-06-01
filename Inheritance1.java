import java.lang.*;



class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("inside base constructor");
    }
    public void fun()
    {
        System.out.println("inside base fun");
    }
    public void fun(int x)
    {
        System.out.println("inside base fun with integer  argument");
    }
    public void gun()
    {
        System.out.println("inside base gun");
    }
}
class Derived extends Base//class Derived:public base
{
    public int x;
    public int y;
    
    public Derived()
    {
        System.out.println("inside derived constructor");
    }
    public void sun()
    {
        System.out.println("inside Derived sun");
    }
}


    class Inheritance1
    {
        static
        {

            System.out.println("inside static block");
        }
    
public static void main(String arg[])
    {
        System.out.println("inside main");

        Derived dobj=new Derived();

        

    }
}


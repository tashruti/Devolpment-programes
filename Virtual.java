import java.lang.*;


class Base
{
    public int i,j;
    public void fun()
    {
        System.out.println("Base fun");//defination
    }
    public void gun()//defination
    {
        System.out.println("Base gun");
    }
    public void sun()//defination
    {
        System.out.println("Base sun");
    }

}

class Derived extends Base
{
    public int x,y;
    public void fun()//overriding
    {
        System.out.println("derived fun");
    }
    public void sun()//overriding
    {
        System.out.println("derived sun");
    }
    public void run()//defination
    {
        System.out.println("derived run");
    }
}

class Virtual
{


public static void main(String arg[])
{
    //Base bobj=new Base();
  // Derived dobj=new Derived();
    Base obj=new Derived();//upcasting//base*bp=new Derived()

    obj.fun();//derived fun
    obj.gun();//base gun
    obj.sun();//derived sun
    //obj.run();
}
}

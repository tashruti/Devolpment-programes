import java.lang.*;




class Base
{
    public int i;
    public int j;

    

    public Base(int a,int b)
    {
        this.i=a;
        this.j=b;
    }
    public void fun()
    {
        System.out.println("inside base fun");
    }
}
class Derived extends Base//class Derived:public base
{
    public int x;
    public int y;
    
    public Derived()//Derived::Base(11,21);
    {
        super(11,21);
        System.out.println("inside derived constructor");
        this.x=30;
        this.y=40;
    }
    public void sun()
    {
        System.out.println("inside Derived sun");
        System.out.println(super.i);
        super.fun();
    }
}


 class Inheritance3
{
public static void main(String arg[])
{
System.out.println("inside main");
Derived dobj=new Derived();
dobj.sun();

}






}
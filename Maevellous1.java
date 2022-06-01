import java.lang.*;
class Demo
{
    public int i;
    public int j;
    public Demo()//default constructor
    {
        this.i=0;
        this.j=0;
    }
    public Demo(int x,int y)//parameterised constructor                                                                                                                                                                                                      
    {
        this.i=x;
        this.j=y;
    }
    public void fun()//behaviour
    {
        System.out.println("inside fun");
    }
    public void gun()//behaviour
    {
        System.out.println("inside gun");
    }

}   
class Marvellous
{
    public static void main(String arg[])
    {
        System.out.println("inside main");
        Demo obj=new Demo();
        obj.fun();//fun(obj);
        obj.gun();//gun(obj);
        System.out.println(obj.i);


        Demo objx=new Demo(11,21);
        objx.fun();
        objx.gun();
        System.out.println(objx.i);

    }
}
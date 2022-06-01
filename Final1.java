import java.lang.*;

class Demo
{
    public int i;
    public final  int j=20;
    public final int k;

    public Demo()//constructor
    {
        this.i=10;
        this.k=30;
    } 
    public Demo(int a,int b)
    {
        this.i=a;
        this.k=b;
    }
    public void fun()
    {
        i++;//A
        //j++;//NA
       // k++;//Na
    }
}
class Final1
{
    public static void main(String arg[])
    {
        System.out.println("inside main");
        Demo obj1=new Demo();
        obj1.fun();
        System.out.println(obj1.i);
        System.out.println(obj1.j);
        System.out.println(obj1.k); 

         
        Demo obj2=new Demo(11,21); 
        obj2.fun();



        System.out.println(obj2.i);
        System.out.println(obj2.j);
        System.out.println(obj2.k);

       
    }
}
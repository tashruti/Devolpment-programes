import java.lang.*;




class Base
{
    public int i;
    public int j;

    

    
    public void fun()
    {
        System.out.println("inside base fun");
    }
}
class Derived extends Base//class Derived:public base
{
    public int x;
    public int y;
    
    
    public void sun()
    {
        System.out.println("inside Derived sun");
    
        
    }
}
    class Derivedx extends Derived
    {
        public int a;
        public void sun()
        {
            System.out.println("inside derivedx sun");
        }
    }

 class Inheritance4
{
public static void main(String arg[])
{
System.out.println("inside main");
Derivedx dobj=new Derivedx();


}

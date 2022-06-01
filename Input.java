import java.util.*;
class Input
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
         System.out.println("Please enter your name");
         String name=sobj.nextLine();
         System.out.println("please enter your age");
         int age=sobj.nextInt();
         System.out.println("please enter your percantage");
         float percantage=sobj.nextFloat();
         System.out.println("your name is:"+name);
         System.out.println("your age:"+age);
         System.out.println("your percantage:"+percantage);
         sobj.close();
         
         
    }
}
import java.lang.*;
import java.util.*;
class AgeInvalid extends Exception
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sobj.nextInt();
        try{
            if(age<18)
            {
                throw new AgeInvalid("age is below 18");
            }
        }
        catch(AgeInvalid obj)
        {
            System.out.println("Inside Catch");
            System.out.println(obj);
            
        }

        
    }
}
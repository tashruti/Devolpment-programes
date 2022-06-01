
import java.lang.*;



class Demo
{
 public void fun()
 {
     System.out.println("inside fun");
 } 
    

}

public class Student
{
    public static void main(String arg[])
    {
        int i;
        Student s1=new Student();
        System.out.println(s1);
            

       s1.fun();
    }
}
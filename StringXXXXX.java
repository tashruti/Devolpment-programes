import java.io.*;

class StringXXXXX
{
    public static void main(String arg[])
    {
        String str1="Hello";//100
        String str2="Hello";//100
        String str3=new String("Hello");//200 

        if(str1==str3)//(100==100)
        {
            System.out.println("String are same");
        }
        else
        {
            System.out.println("String are differant");
            
        }
        if(str1.equals(str2))//if("Hello".equals("Hello"))
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are differant");
        }
        
    }
}
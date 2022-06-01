import java.lang.*;
class String1
{
    public static void main(String arg[])
    {
        char ch='a';
        String str=Character.toString(ch);

        System.out.println("String is:"+str);

        String str2=String.valueOf(ch);
        System.out.println("String is:"+str2);
    }
}
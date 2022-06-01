import java.lang.*;
import java.util.*;
import java.net.*;
public class Myserver
{
    public static void main(String arg[])
    {

        try
        {
            ServerSocket ss=new ServerSocket(7777);

            Socket s=ss.accept();

            DataInputStream dis=new DataInputStream(s.getInputStream());

            String str=(String)dis.readUTF();

            System.out.println("Message="+str);
            ss.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
    }
}



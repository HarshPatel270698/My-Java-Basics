import java.net.*;
import java.io.*;
import java.sql.*;
public class Server
{
    public static void main(String args[])
    {
        String msg;
        try
        {
            ServerSocket ss=new ServerSocket(3214);
            System.out.println("Msg From Client");
            while(true)
            {
                Socket s=ss.accept();
                BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
                msg=br.readLine();
                System.out.println(msg);	
            }
        }
        catch(Exception e)
        {
            System.out.println("Ex is:"+e);
        }
    }
}

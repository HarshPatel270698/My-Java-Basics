import java.io.DataOutputStream;
import java.net.*;
import java.util.Scanner;
public class Client 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String msg;
        System.out.println("Enter Message:");
        msg=sc.nextLine();
        try
        {
            Socket s=new Socket("localhost", 3214); // connection to ServerSocket
            DataOutputStream ds=new DataOutputStream(s.getOutputStream());
            ds.writeBytes(msg);
            s.close();
        }
        catch(Exception e)
        {
            System.out.println("Ex is:"+e);
        }
    }    
}

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
public class Client 
{
    public static void main(String args[])
    {
        byte outdata[]=new byte[1024];
        Scanner sc=new Scanner(System.in);
        String msg=null;
        System.out.println("Enter Message:");
        msg=sc.nextLine();
        outdata=msg.getBytes();
        try
        {
            DatagramSocket ds=new DatagramSocket();
            InetAddress ip_add=InetAddress.getByName("localhost");
            DatagramPacket dp=new DatagramPacket(outdata,outdata.length,ip_add,1234);
            ds.send(dp);
            ds.close();
            
        }
        catch(Exception e)
        {
            System.out.println("Ex is:"+e);
        }
    }    
}

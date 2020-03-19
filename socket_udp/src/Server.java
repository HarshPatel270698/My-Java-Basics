
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server
{
    public static void main(String args[])
    {
        String msg=null;
        byte indata[]=new byte[1024];
        try
        {
            DatagramSocket ds=new DatagramSocket(1234);
            while(true)
            {
                DatagramPacket dp=new DatagramPacket(indata, indata.length);
                ds.receive(dp);
                msg=new String(dp.getData());
                System.out.println("Data From Client:-"+msg);
            }
        }
        catch(Exception e)
        {
            System.out.println("Ex is:"+e);
        }
    }
}

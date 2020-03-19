package jdbc_connection;
import java.sql.*;
public class CallableStatement_demo 
{
    public static void main(String args[])
    {
        Connection con=null;
        CallableStatement cb=null;
        ResultSet rs=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            cb=con.prepareCall("CALL gaurang()");
            rs=cb.executeQuery();
            System.out.println("No\tName");
            while(rs.next())
            {
                System.out.println(rs.getString(1)+"\t"+rs.getString(2));
            }
            /*cb=con.prepareCall("CALL Insert_Rec()");
            int i=cb.executeUpdate();
            if(i>0)
                System.out.println("Record is Inserted");
            else
                System.out.println("Not ");*/
        }
        catch(Exception e)
        {
            System.out.println("Ex is:"+e);
        }
    }
}

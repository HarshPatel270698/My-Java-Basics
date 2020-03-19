package jdbc_connection;
import java.sql.*;
import java.util.Scanner;
public class Jdbc_connection
{
    public static void main(String[] args) 
    {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        Scanner sc=new Scanner(System.in);
        String sname=null,saddress=null,no=null;
        int ch;    
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            st=con.createStatement();
            do
            {
                System.out.println("1 Insert");
                System.out.println("2 View");
                System.out.println("3 Delete");
                System.out.println("4 Update");
                System.out.println("5 Exit");
                System.out.println("Enter Your Choice");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                            System.out.println("Enter Name");
                            sname=sc.next();
                            System.out.println("Enter Address");
                            saddress=sc.next();
                            int i=st.executeUpdate("insert into student(sname,saddress)values('"+sname+"','"+saddress+"')");
                            if(i>0)
                                System.out.println("Insert Record");
                            else
                                System.out.println("Not Submitted");
                            break;
                    case 2:
                            System.out.println("No\tName\tAddress");
                            rs=st.executeQuery("select *from student");
                            while(rs.next())
                            {
                                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
                            }
                            break;
                    case 3:
                            System.out.println("Enter No:");
                            no=sc.next();
                            int j=st.executeUpdate("delete from student where sno='"+no+"'");
                            if(j>0)
                                System.out.println("Record is Deleted");
                            else
                                System.out.println("Record is not Deleted");
                            
                            break;
                    case 4:
                            System.out.println("Enter No:");
                            no=sc.next();
                            System.out.println("Enter Name");
                            sname=sc.next();
                            System.out.println("Enter Address");
                            saddress=sc.next();
                            int k=st.executeUpdate("update student set sname='"+sname+"',saddress='"+saddress+"' where sno='"+no+"'");
                            if(k>0)
                                System.out.println("Record is Updated");
                            else
                                System.out.println("Record is not Updated");
                            
                            
                            break;
                }
            }while(ch!=5);
        }
        catch(Exception e)
        {
            System.out.println("Ex is:"+e);
        }
    }
    
}

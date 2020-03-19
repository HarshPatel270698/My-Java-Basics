/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_connection;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Harsh
 */
public class Java_connection 
{

    public static void main(String[] args) 
    {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        int ch;
        String name=null;
        Scanner sc=new Scanner(System.in);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            st=con.createStatement();
            do
            {
                System.out.println("1 Insert");
                System.out.println("2 View");
                System.out.println("3 Exit");
                System.out.println("Enter Your Choice:");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                            System.out.println("Enter Name:");
                            name=sc.next();
                            int i=st.executeUpdate("insert into student(name)values('"+name+"')");
                            if(i>0)
                                System.out.println("Record is Submitted");
                            else
                                System.out.println("Not Submitted");
                           break;
                    case 2:
                            System.out.println("No\tName\n");
                            rs=st.executeQuery("select *from student");
                            while(rs.next())
                            {
                                System.out.println(rs.getString(1)+"\t"+rs.getString(2));
                            }
                            System.out.println("\n");
                            
                }
            }while(ch!=3);
        }
        catch(Exception e)
        {
            System.out.println("Ex is:-"+e);
        }
    }
    
}

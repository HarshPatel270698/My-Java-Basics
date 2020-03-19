/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.*;
import java.util.AbstractList;
import java.util.ArrayList;
/**
 *
 * @author shree
 */
@ManagedBean
@RequestScoped
public class StudentBean
{

    /** Creates a new instance of StudentBean */
    public StudentBean()
    {
    }
    public List<Student> getStudent()throws ClassNotFoundException,SQLException
    {
           Connection con=null;
           Statement st=null;
           ResultSet rs=null;
           List<Student> students=new ArrayList<Student>();
           try
           {
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
               st=con.createStatement();
               rs=st.executeQuery("select *From student");
               while(rs.next())
               {
                   Student s=new Student();
                   s.setNo(rs.getInt(1));
                   s.setName(rs.getString(2));
                   students.add(s);
               }
           }
           catch(Exception e)
           {
               
           }
           return students;
    }
}

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
public class demo extends HttpServlet 
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
         PrintWriter out=res.getWriter();
        try
        {
            Connection con=null;
            Statement st=null;
            ResultSet rs=null;
            String name=null,no=null,action=null;
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            st=con.createStatement();
            action=req.getParameter("b1");
            if(action.equals("Save"))
            {
                name=req.getParameter("tname");
                int i=st.executeUpdate("insert into student(name)values('"+name+"')");
                if(i>0)
                    res.sendRedirect("index.jsp");
                else
                    out.println("Not Submitted");
            }
            if(action.equals("Delete"))
            {
                            no=req.getParameter("tno");
                            int j=st.executeUpdate("delete from student where id='"+no+"'");
                            if(j>0)
                                out.println("Record is Deleted");
                            else
                                out.println("Record is not Deleted");
            }
            if(action.equals("Update"))
            {
                 no=req.getParameter("tno");
                 name=req.getParameter("tname");
                            int k=st.executeUpdate("update student set name='"+name+"' where id='"+no+"'");
                            if(k>0)
                                out.println("Record is Updated");
                            else
                                out.println("Record is not Updated");
            }
            if(action.equals("View"))
            {
                rs=st.executeQuery("select *from student");
                out.println("<html><br/><br/><table cellpadding=5 cellspacing=5 border=1>");
                out.println("<tr>"
                        + "<th>No</th>"
                        + "<th>Name</th></tr>");
                while(rs.next())
                {
                    out.println("<tr>"
                            + "<td>"+rs.getString(1)+"</td>"
                                    + "<td>"+rs.getString(2)+"</td></tr>");
                } 
                out.println("</table></html>");
            }
        }
        catch(Exception e)
        {
            out.println("Ex is:"+e);
        }
    }
}
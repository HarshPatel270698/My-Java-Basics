import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/demo"})
public class demo extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        PrintWriter out=res.getWriter();
        int no,fact=1;
        
        String str=getServletConfig().getInitParameter("Number");
        out.println("Str is:"+str);
        no=Integer.parseInt(str);
        while(no>0)
        {
            fact=fact*no;
            no--;
        }
        out.println("Fact is: "+fact);
    }
}
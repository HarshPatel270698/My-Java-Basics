import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class demo extends HttpServlet 
{
 public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        PrintWriter out=res.getWriter();
        int no,ans=0;
        no=Integer.parseInt(req.getParameter("t1"));
        String action=null;
        action=req.getParameter("b1");
        if(action.equals("Square"))
        {
            ans=no*no;
            out.println("Square is:- "+ans);
        }
        if(action.equals("Cube"))
        {
            ans=no*no*no;
            out.println("Cube is:- "+ans);
        }
    }
}
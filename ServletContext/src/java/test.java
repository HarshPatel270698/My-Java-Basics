import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class test extends HttpServlet 
{
  public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        PrintWriter out=res.getWriter();
        String str=null;
        ServletContext context=req.getServletContext();
        str=context.getAttribute("key").toString();
        out.println("Your Key is:"+str);
        
        context.removeAttribute("key");
        
        if(context.getAttribute("key")==null)
        {
            out.println("Your Context is Empty");
        }
    }
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
  {
      doPost(req, res);
  }
}
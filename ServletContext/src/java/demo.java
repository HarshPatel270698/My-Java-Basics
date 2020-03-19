import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class demo extends HttpServlet 
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        PrintWriter out=res.getWriter();
        String str=null;
        str=req.getParameter("t1");
        ServletContext context=req.getServletContext();
        context.setAttribute("key", str);
        out.println("<html><head><body><h3><a href=test>View Data</a></h3></body></head></html>");
    }
}

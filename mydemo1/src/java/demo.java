import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/demo"})
public class demo extends GenericServlet 
{
    public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
    {
        PrintWriter out=res.getWriter();
        out.println("Hello This is my demo");
    }
}
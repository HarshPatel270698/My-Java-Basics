import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class demo extends HttpServlet 
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        PrintWriter out=res.getWriter();
        HttpSession ses=req.getSession();
        String uname=null,pass=null,action=null;
        action=req.getParameter("b1");
        if(action.equalsIgnoreCase("save"))
        {
            uname=req.getParameter("t1");
            pass=req.getParameter("t2");
            ses.setAttribute("un", uname);
            ses.setAttribute("ps", pass);
            res.sendRedirect("index.html");
        }
        if(action.equalsIgnoreCase("view"))
        {
            out.println("User Name:-"+ses.getAttribute("un"));
            out.println("Password:-"+ses.getAttribute("ps"));
        }
        if(action.equalsIgnoreCase("delete"))
        {
            ses.removeAttribute("un");
            ses.removeAttribute("ps");
            out.println("Remove from Session");
             res.sendRedirect("index.html");
        }
    }
}
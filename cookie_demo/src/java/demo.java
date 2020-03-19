import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class demo extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        String str=null,action=null;
        action=req.getParameter("b1");
        PrintWriter out=res.getWriter();
        if(action.equals(null))
        {
            out.println("empty cookie");
        }
        if(action.equals("Save"))
        {
            str=req.getParameter("t1");
            Cookie c=new Cookie("key", str);
            res.addCookie(c);// store at client side
            res.sendRedirect("index.html");
        }
        if(action.equals("View"))
        {
            
            // View All Cookie
            
            
        /*    Cookie ck[]=req.getCookies();
            out.println("Len is:-"+ck.length);
            for(int i=0;i<ck.length;i++)
            {
                out.println("Name is:- "+ck[i].getName()+"\tValue is:-"+ck[i].getValue().toString());
            }
          */  
            // view Specific
                Cookie ck[]=req.getCookies();
            out.println("Len is:-"+ck.length);
            for(int i=0;i<ck.length;i++)
            {
                if(ck[i].getName().toString().equals("key"))
                {
                    out.println("Value is:-"+ck[i].getValue().toString());
                }
            }
        }  
    }
}
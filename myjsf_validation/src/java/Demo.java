import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean
@RequestScoped

public class Demo
{
   String str;
    public Demo() 
    {
    }

    public String getStr() 
    {
        return str;
    }

    public void setStr(String str)
    {
        this.str = str;
    }
   
}
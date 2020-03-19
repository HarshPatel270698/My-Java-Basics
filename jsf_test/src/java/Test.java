import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean
@RequestScoped
public class Test
{
    int no;
    public Test() 
    {
    }
    public int getNo() {
        return no;
    }

    public void setNo(int no)
    {
        this.no = no;
    }
}
/*
BHUL AYA HTI.........................JE ME SUDHARI CHHE SO AA NY JOVANI
package My;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
@Named(value = "test")
@Dependent
public class Test 
{
    private int no;
    public Test()
    {
    }
    public int getNo()
    {
        return no;
    }
    public void setNo(int no)
    {
        this.no = no;
    }
}*/
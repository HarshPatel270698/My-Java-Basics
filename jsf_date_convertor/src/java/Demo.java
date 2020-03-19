/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



/**
 *
 * @author shree
 */
@ManagedBean
@RequestScoped
public class Demo 
{
    private Date date;
   
    public Demo() 
    {
    }

    public Date getDate() 
    {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}

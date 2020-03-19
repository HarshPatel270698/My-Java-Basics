/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author shree
 */
@ManagedBean
@RequestScoped
public class Demo
{
    public String status="False";
    public Demo() 
    {
        
    }

    public String getStatus() 
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
    public void processMyAction(ActionEvent e)
    {
        if(status.equals("False"))
        {
            status="True";
        }
        else
        {
            status="False";
        }
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
    String str;
    double pi;
    /** Creates a new instance of Demo */
    public Demo() 
    {
        pi=3.14;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    public double  getPi()
    {
        return pi;
    }
    
}

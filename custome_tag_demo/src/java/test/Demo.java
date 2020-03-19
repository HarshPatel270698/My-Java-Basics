/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Harsh
 */
public class Demo extends TagSupport
{
    public int doStartTag()throws JspException
    {
        try
        {
            JspWriter out=pageContext.getOut();// for display message on Jsp Page
            out.println("Hello This is demo of Custome Tag");
        }
        catch(Exception e)
        {
            throw new JspException(e.getMessage());
        }
        return  EVAL_PAGE;
    }
}

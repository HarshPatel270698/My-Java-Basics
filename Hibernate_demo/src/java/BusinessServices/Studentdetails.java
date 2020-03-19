/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessServices;
import Model.Student;

import org.hibernate.Transaction;
import org.hibernate.Session;

import Util.NewHibernateUtil;
import java.io.PrintWriter;

import org.hibernate.Query;

/**
 *
 * @author Harsh
 */
public class Studentdetails 
{
     public String addStudent(Student ss)
    {
        
         String message=null;
        Session s=null;
        try
        {
            s=NewHibernateUtil.getSessionFactory().openSession();
            Transaction tr=s.getTransaction();
           tr.begin();
          s.save(ss);
          tr.commit();
                message="Saved Data";  
           return message; 
        }
        catch (Exception e)
        {
            System.out.println("BusinessServices.Studentdetails.addStudent()"+e); 
            return (e.getMessage());
        }
        finally 
        {
               s.close();
        }
 
 
    }
}

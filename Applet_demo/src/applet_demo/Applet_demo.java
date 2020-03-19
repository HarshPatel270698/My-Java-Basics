/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_demo;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Harsh
 */
public class Applet_demo extends Applet implements ActionListener
{
    Label l;
    TextField txt;
    Button btn;
    public void init()
    {
        l=new Label("Enter No");
        txt=new TextField(10);
        btn=new Button("Factorail");
        add(l);
        add(txt);
        add(btn);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int no,fact=1;
        no=Integer.parseInt(txt.getText().toString());
        while(no>0)
        {
            fact=fact*no;
            no--;
        }
        JOptionPane.showMessageDialog(null, "Fact is:-"+fact);
        txt.setText("");
         
    }
}

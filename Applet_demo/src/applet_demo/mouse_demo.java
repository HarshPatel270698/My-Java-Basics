/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_demo;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.applet.Applet;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Harsh
 */
public class mouse_demo extends Applet
        implements MouseListener,MouseMotionListener
{
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Click");
            setBackground(Color.red);
    }

    @Override
    public void mousePressed(MouseEvent e) {
         System.out.println("Press");
            setBackground(Color.CYAN);
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Released");
            setBackground(Color.BLUE); 
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
      System.out.println("Enter");
            setBackground(Color.PINK); 
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
      System.out.println("exit");
            setBackground(Color.BLACK); 
    }

    @Override
    public void mouseDragged(MouseEvent e) 
    {
     System.out.println("Draged");
            setBackground(Color.GREEN); 
    }

    @Override
    public void mouseMoved(MouseEvent e) 
    {
      System.out.println("Move");
            setBackground(Color.GRAY); 
    }
}

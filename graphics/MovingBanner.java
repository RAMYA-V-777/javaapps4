/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author velmurugan
 */
public class MovingBanner extends Frame{

    /**
     * @param args the command line arguments
     */
    MovingBanner()//cons
    {
        setSize(600,400);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                dispose();
            }
        });
    }
    public void run()
    {
        try
        {
            while(true)
            {
                c=str.charAt(o);//take j alone
                str=str.substring(1);
                str=str+c;
                Thread.sleep(100);
                repaint();
            }
        }
        catch(Exception e)
        {
            
        }
    }
    public void paint(Graphics g)
    {
        setBackground(Color.BLUE);
        setForeground(Color.red);
        Font f=new Font("Arial",Font.BOLD,40);
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new MovingBanner();
    }
}
    


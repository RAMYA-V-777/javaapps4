/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author velmurugan
 */
public class ButtonCreationInFrame extends JFrame {

    /**
     * @param args the command line arguments
     */
    JButton b1,b2,b3;
    ButtonCreationInFrame()
    {
        b1=new JButton("Red");
        b1.setBounds(100,100,100,50);
        b1.setBackground(Color.red);
        b2=new JButton("Blue");
           b2.setBounds(210,100,100,50);
           b2.setBackground(Color.BLUE);
        b3=new JButton("Green");
           b3.setBounds(320,100,100,50);
           b3.setBackground(Color.GREEN);
           add(b1);
           add(b2);
           add(b3);
           b1.addActionListener((ActionListener) this);
           b2.addActionListener((ActionListener) this);
              b3.addActionListener((ActionListener) this);
           //SIZE FOR FRAME
           setSize(600,400);
           setLayout(null);
           setVisible(true);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
            getContentPane().setBackground(Color.red);
                     if(ae.getSource()==b2)
                            getContentPane().setBackground(Color.BLUE);
                          if(ae.getSource()==b3)
                  getContentPane().setBackground(Color.GREEN);               
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new ButtonCreationInFrame();
    }
                                                                                                                 
}

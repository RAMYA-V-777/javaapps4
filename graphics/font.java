package graphics;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class font extends Applet {

public void paint (Graphics g)
{
Font f=new Font("TimesNewRoman",Font.PLAIN,180);
Font f1=new Font("Arial",Font.BOLD,18);
Font f2=new Font("Calibra",Font.BOLD+Font.ITALIC,18);
Font f3=new Font("Georgia",Font.HANGING_BASELINE,18);
JLabel background = new JLabel(new ImageIcon("C:\\Users\\Public\\Pictures\\gmain.jpeg")); 
setBackground(Color.black);
setForeground(Color.MAGENTA);


g.setFont(f);
g.drawString("Ramya ammu",100,250);
g.setFont(f1);
g.drawString("Ramya ammu",10,50);
g.setFont(f2);
g.drawString("Ramya ammu",10,75);
g.setFont(f3);
g.drawString("Ramya ammu",10,100);
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class NewAppletDesign extends Applet {
public void init () {
//TODO start asynchronous download of heavy resources
}

public void paint(Graphics g)
{
Font f=new Font("ArialBlack",Font.ITALIC,24);
g.setFont(f);
setForeground(Color.MAGENTA);
g.drawString("RAMYA AMMU",100,100);
Font f1=new Font("Georgia",Font.BOLD,25);
g.setFont(f1);
g.drawString("AMMU RAMYA",25,25);
g.setColor(Color.MAGENTA);
g.drawLine(0,0,150,150);
g.setColor(Color.BLACK);
g.drawRect(50,60,40,40);
g.setColor(Color.lightGray);
g.fill3DRect(225,225,60,80,true);
g.setColor(Color.BLUE);
g.fillRect(60,80,25,25);
g.setColor(Color.RED);
g.drawRoundRect(300,300,100,100,20,20);
g.setColor(Color.darkGray);
g.fillRoundRect(400,400,90,90,15,15);

Color c=new Color(180,224,112);
g.setColor(c);
g.drawOval(500,500,100,100);
g.setColor(new Color(220,12,56));
g.fillOval(600,600,150,150);
}
}
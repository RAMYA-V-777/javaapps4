/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Smiley extends Applet {

   
    public void paint(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.fillOval(20,20,150,150);
        g.setColor(Color.BLACK);
     //   g.fillOval(50,60,15,25);
        g.fillOval(120,60,15,25);
        int x[]={95,85,106,95};
        int y[]={85,104,104,85};
       g.drawPolygon(x,y,4);
        g.drawArc(55,95,78,50,0,-180);//smile
     //   g.drawArc(180,0,50,78,95,-55);//dump
        // g.drawLine(60,130,130,130);//silent
        g.drawLine(70,80,48,80);//wink-lefft eye
        int s[]={30,60,25,25};
        int t[]={60,49,8,35};
        g.drawPolygon(s, t,4);
          int u[]={-25,-25,-60,-30};
        int v[]={-35,-8,-49,-60};
        g.drawPolygon(u,v,4);
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}


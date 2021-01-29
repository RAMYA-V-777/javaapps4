/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Mushroom2 extends Applet {
public void init() {
//TODO start asynchronous download of heavy resources
}

public void paint(Graphics g)
{
setBackground(Color.yellow);
g.setColor(Color.BLUE);
g.fillRect(30,250,250,100);

g.setColor(Color.BLACK);
g.drawLine(125,250,125,160);
g.drawLine(175,250,175,160);

g.drawArc(85,157,130,50,-65,312);
g.drawArc(85,87,130,50,62,58);

g.drawLine(85,177,119,89);
g.drawLine(215,177,181,89);

g.setColor(Color.red);
g.fillArc(78,120,40,40,63,-174);
g.setColor(Color.blue);
g.fillOval(120,96,40,40);
g.setColor(Color.red);
g.fillArc(173,100,40,40,110,180);
}
}
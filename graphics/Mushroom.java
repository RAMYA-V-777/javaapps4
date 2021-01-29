/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author velmurugan
 */
public class Mushroom extends Applet {
    public void paint(Graphics h)
    {
        h.fillRect(35,250,250,100);
        h.drawLine(125,250,125,160);
        h.drawLine(175,250,175,160);
        h.drawArc(85,157,130,50,-65,312);
        h.drawArc(85,87,130,50,62,58);
        h.drawLine(85,177,119,89);
        h.drawLine(215,177,181,89);
        h.fillArc(78,120,40,40,63,-174);
        h.fillOval(120,96,40,40);
        h.fillArc(173,100,40,40,110,180);
    }

    // TODO overwrite start(), stop() and destroy() methods
}

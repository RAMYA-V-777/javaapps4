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
public class Bus extends Applet {

     public void paint(Graphics r)
     {
         setBackground(Color.black);
         r.setColor(Color.PINK);
         r.fillRect(100,600,800,340);
         r.setColor(Color.BLUE);
         r.fillOval(500,600,300,500);
     }
    // TODO overwrite start(), stop() and destroy() methods
}

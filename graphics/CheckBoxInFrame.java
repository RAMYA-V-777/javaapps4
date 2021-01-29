/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
/**
 *
 * @author velmurugan
 */
public class CheckBoxInFrame extends JFrame implements ItemListener
{
    /**
     * @param args the command line arguments
     */
    JCheckBox c1,c2,c3;
    CheckBoxInFrame()
    {
        c1=new JCheckBox("Java");
        c1.setBounds(100,100,100,50);
        c2=new JCheckBox("C++");
        c2.setBounds(100,170,100,50);
        c3=new JCheckBox("C");
        c3.setBounds(100,241,100,50);
        add(c1);
        add(c2);
        add(c3);
        setSize(600,400);
        setLayout(null);
        setVisible(true);   
    }
    public static void main(String[] args)
    {
        // TODO code application logic here
        new CheckBoxInFrame();
    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

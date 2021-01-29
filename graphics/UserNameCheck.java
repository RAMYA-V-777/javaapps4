/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author velmurugan
 */
public class UserNameCheck extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    JLabel l1,l2;
    JTextField t1,t2;//to add text box
    JButton b1;//to add button=====>listener is actionlistener--->only one method action performed
    UserNameCheck()
    {
        l1=new JLabel("USER NAME");
        l1.setBounds(100,100,150,30);
        l2=new JLabel("PASSWORD");
        l2.setBounds(100,150,150,30);
        t1=new JTextField();
        t1.setBounds(250,100,150,30);
        t2=new JTextField();
        t2.setBounds(250,150,150,30);
        b1=new JButton("CLICK");
        b1.setBounds(200,170,150,30);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(t1.getText().equals("ABC")&&t2.getText().equals("123"))
        {
          JOptionPane.showMessageDialog(null,"Welcome"+t1.getText()+"!!!");
        }
        else
            JOptionPane.showMessageDialog("Invalid name & password");
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
       new UserNameCheck();
    

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


import java.util.*;  
 public class aaa1{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
      list.add("java");//Adding object in arraylist    
      list.add("c");    
      list.add("c++");    
      list.add("python");    
      list.add("VB"); 
      list.add("VC++"); 
      //Printing the arraylist object   
      System.out.println(list);  
 }  
}  
package chat;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.*;
import java.awt.*;

import java.util.Random;

public class SignUp extends JFrame implements Serializable{
    JLabel l1,l2, l3, l4, l5, l6, l7, l8;
    JTextField t1, t2, t3, t5 , t6, t7, t8;
    JButton b1, b2;
    JPanel p1, p2;
    JPasswordField jpf;

    public SignUp()
    {
        setSize(500,500);
        setLayout (new BorderLayout());
        l1 = new JLabel (" Enter First Name");
        l2 = new JLabel (" Enter Last Name");
        l3 = new JLabel (" Enter Username");
        l5 = new JLabel (" Enter Password (The Password must contain 2 Upper Case Alphabets and 2 Digits):");
        l6 = new JLabel (" Enter Gmail");
        l7 = new JLabel (" Enter Phone");
        l8 = new JLabel (" Enter Cnic");
     
              
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        jpf = new JPasswordField(20);
        t6 = new JTextField(20);
        t7 = new JTextField(20);
        t8 = new JTextField(20);
              
                    
        
              b1 = new JButton("Submit");
              b2 = new JButton("Home");
              p1 = new JPanel();
              p1.setLayout(new GridLayout(16,2));
         
              p2 = new JPanel();
              p2.setLayout(new FlowLayout());
              
              p1.add(l1);
              p1.add( t1);
              p1.add(l2);
              p1.add( t2);
         
              p1.add(l3);
              p1.add( t3);
         
         
              p1.add(l5);
              p1.add( jpf);
              
              p1.add(l6);
              p1.add( t6);
              
              p1.add(l6);
              p1.add( t6);
              
              p1.add(l7);
              p1.add( t7);
              
              p1.add(l8);
              p1.add( t8);
              
              
              p2.add(b1);
              p2.add(b2);
              
              add(p1,BorderLayout.CENTER);
              add(p2, BorderLayout.SOUTH);
              
            b1.addActionListener(new MyListener());
            b2.addActionListener(new MyListener());
              setVisible(true);
    }
              
                public class MyListener implements ActionListener 
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        int counts1 = 0;
                        int counts2 = 0;
                        if (e.getSource()== b1)
                        {
                            
                            
                        if(t6.getText().contains("@") && t6.getText().contains(".com"))
                        {
                            
                        }   
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Kindly Enter a valid G-mail ID");
                            t6.setText(" ");
                        }
                        
                        if(t7.getText().matches("[0-9+]{4}-[0-9+]{7}"))
                        {
                            
                        }   
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Kindly Enter a valid Phone No");
                            t7.setText(" ");
                        }
                        
                        if(t8.getText().matches("[0-9+]{5}-[0-9+]{7}-[0-9]{1}"))
                        {
                            
                        }   
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Kindly Enter a valid CNIC");
                            t8.setText(" ");
                        }
                    
                        
                        
                        if(t8.getText().matches("[0-9+]{5}-[0-9+]{7}-[0-9]{1}" ) && t6.getText().contains("@") && t6.getText().contains(".com") && t7.getText().matches("[0-9+]{4}-[0-9+]{7}"))
                        {
                            user s1 = new user (); 
                                    s1.setFirstName(t1.getText());
                                    s1.setLastName(t2.getText());
                                    s1.setUserName(t3.getText());
                                    s1.setPassword(jpf.getText());
                                    s1.setEmail(t6.getText());
                                    s1.setPhoneNo(t7.getText());
                                    s1.setCNIC(t8.getText());

                                    user.WriteToFile(s1);
                                    dispose();
                                    SignIn s = new SignIn();
                                    
                        }
                        else
                        {}
                                
                        }
                        else if (e.getSource()== b2)
                        {
                            dispose();
                            Start a = new Start();
                        }
                    }
            }
    public static void main(String[] args) {
        SignUp entry = new SignUp();
    }
}

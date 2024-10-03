package Hospital_Management_System;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame{
    JTextField t;
    JPasswordField p;
    



    login(){
        
    JFrame f=new JFrame();

    JLabel l=new JLabel("Username :");
    l.setBounds(20,20,200,30);
    l.setForeground(Color.BLUE);
    l.setFont(new Font("Verdana", Font.BOLD, 16));
    f.add(l);


    t=new JTextField();
    t.setBounds(200,20,80,30);
    t.setForeground(Color.BLUE);
    f.add(t);


    JLabel l1=new JLabel("Password :");
    l1.setBounds(20,70,200,30);
    l1.setForeground(Color.BLUE);
    l1.setFont(new Font("Verdana", Font.BOLD, 16));
    f.add(l1);


    p=new JPasswordField();
    p.setBounds(200,70,80,30);
    p.setForeground(Color.BLUE);
    f.add(p);




    f.setBounds(500,200,500,300);
    f.setLayout(null);
    f.setVisible(true);
    }



public static void main(String[] args) {
    new login();                   
}
}

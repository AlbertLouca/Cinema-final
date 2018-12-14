/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;





import static cinema.Cinema.hash;
import static cinema.Cinema.loadhash;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

/**
 *
 * @author Chadi N. Louca
 */
public class JLogin extends JFrame {
    JPanel j1;
    JLabel l1;
    JTextField username;
    JLabel l2;
    JPasswordField p1;
  final  JButton log;

    public JLogin(){
     j1=new JPanel();
      
      j1.setLayout(null);
      this.add(j1);
      l1=new JLabel("Username:");
        username=new JTextField(10);
       l2=new JLabel("Password:");
     
       p1=new JPasswordField(10);
         setBounds(300,275,500,400);
        setTitle("Logging in");
        j1.add(l1);
        l1.setBounds(100,50,150,50);
        j1.add(username);
        username.setBounds(190,50,100,50);
        
        j1.add(l2);
        l2.setBounds(100,130,150,50);
        j1.add(p1);
        p1.setBounds(190,160,100,50);
 log=new JButton("Login");
 j1.add(log);
 log.setBounds(230,230,100,50);
 log.addActionListener(new myt());
 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   class myt implements ActionListener{
 
            @Override
            public void actionPerformed(ActionEvent ae) {
      //User i=new User();
  //AdminMenu am=new AdminMenu();
 // boolean d=false;
 
    boolean found=false;
    User temp=null;
 for(String x:hash.keySet()){
     
      if(username.getText().equals(hash.get(x).getUsername())&&hash.get(x).getPassword().equals(p1.getText())) {
          temp=hash.get(x);
          found=true;
      break;
      }}

  JOptionPane.showMessageDialog(null,("welcome "+temp.getName()));
     if(found){
        
         if(username.getText().equals("admin")||(temp.getPower())){
         AdminMenu am=new AdminMenu(temp);
         am.setVisible(true);
         setVisible(false);
         
         }else{
         userMenu um=new userMenu(temp);
         um.setVisible(true);
         setVisible(false);}
     }
     else
           JOptionPane.showMessageDialog(null,"Username or Password is incorrect");   

 }}}
  
 
 
    
    
    
    
    
   

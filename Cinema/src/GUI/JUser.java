/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Users.User_Data;
import static cinema.Cinema.UserLib;
import static cinema.Cinema.hash;
import static cinema.Cinema.savehash;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class JUser extends JFrame{
   
  JPanel j1;
  JTextArea ta;
  JLabel l1;
  JTextField username;
  final JButton create;
   JLabel l2;
    JPasswordField p1;
    JRadioButton m ;
    JRadioButton f;
    JLabel genderT;
    JLabel name;
    JTextField rn;
    ButtonGroup bg;
   public  JUser (){
       
        j1=new JPanel();
 
     j1.setLayout(null);
  // JLabel username = new JLabel("username");
  // ta=new JTextArea();
  // ta.setBounds(200,100,30,100);
   this.add(j1);
   l1=new JLabel("Username:");
   l1.setBounds(10,30,100,30);
           username=new JTextField(20);
    username.setBounds(140,30,100,30);
   create=new JButton("create user");
        j1.add(l1);
       setBounds(400,100,400,300);
        setTitle("Creating User"); 
       //j1.setBackground(Color.green);       
       j1.add(username);     //typing username
      l2=new JLabel("Password:");
       j1.add(l2);
       l2.setBounds(10,70,100,30);
      p1=new JPasswordField(10);
      p1.setBounds(140,70,100,30);
       j1.add(p1);     
       name=new JLabel("Name:");
       j1.add(name);
       name.setBounds(10,110,100,30);
       rn=new JTextField(20);
       j1.add(rn);
       rn.setBounds(140,110,100,30);
       j1.add(create);
       genderT=new JLabel("gender:");
      j1.add(genderT);
      genderT.setBounds(10,150,100,30);
      m=new JRadioButton("Male");
      j1.add(m);
      m.setBounds(120,150,100,30);
      f=new JRadioButton("Female");
      j1.add(f);
      f.setBounds(220,150,100,30);
      bg=new ButtonGroup();
      m.setSelected(true);
      
      bg.add(m);
      bg.add(f);
      create.setBounds(130,190,100,30);
       create.addActionListener(new myHolder());
       // this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
   class myHolder implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
User u=new User();
if(p1.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Password cannot be empty!");
}
else
    if(username.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Username cannot be empty!");
    }
    else {
boolean istaken =false;


  
             for(User i:UserLib){
                // System.out.println("testing");
                 if (i.getUsername().equals(username.getText())){
                   JOptionPane.showMessageDialog(null, "Username already taken");
                   istaken=true;
                   break;
                    }}
             if(istaken){}
             else{
               
                     u.setUsername(username.getText());
                 u.setPassword(p1.getText());
               if(m.isSelected()){
                   u.gender="male";
               }
               if(f.isSelected())
                   u.gender="female";
                if(username.getText().equals("admin"))
                    u.givePower();
                u.setname(rn.getText());               // User_Data as=new User_Data();
                //as.save();
                 UserLib.add(u);
                
                 hash.put(u.getUsername(),u);
    try {
        savehash();
        
        User_Data x=new User_Data();
        x.save();
        JOptionPane.showMessageDialog(null,"User Created Successfully");
    } catch (IOException ex) {
       JOptionPane.showMessageDialog(null, "failed to save the new User");
    }
            
        
             }
       
       setVisible(false);}}
       
        }

}
   
   

    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Users.User;
import java.util.ArrayList;
import javax.swing.*;

import static cinema.Cinema.UserLib;
import static cinema.Cinema.hash;
import static cinema.Cinema.savehash;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chadi N. Louca
 */
public class GivePower extends JFrame{
    
    JPanel j1;
    JLabel text;
   
   // ArrayList<User> sd=UserLib.clone();
     JList list;
    ArrayList <String> names=new ArrayList<String>();
    
    JButton submit;

   public GivePower(){
       for(String x:hash.keySet()){
           names.add(x);
           
           
           
       }
       
        j1=new JPanel();
        this.add(j1);
        text=new JLabel("please choose a user to promote");
     list=new JList(names.toArray());
     submit=new JButton ("Submit");
     
j1.add(submit);
submit.setBounds(300,500,300,50);
        setBounds(300,275,500,400);
        j1.add(text);
        text.setBounds(50,100,300,50);
        j1.add(list);
        list.setBounds(120,200,300,400);
        submit.addActionListener(new myh());
        
    }
   
   class myh implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
           User x=  hash.get(list.getSelectedValue());
           x.givePower();
           if(x.getPower())
               JOptionPane.showMessageDialog(null, "success");
            try {
                savehash();
            } catch (IOException ex) {
                Logger.getLogger(GivePower.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
       
       
       
   }
}

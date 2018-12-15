/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;
import cinema.Movie;
import Users.Movie_Data;
import static cinema.Cinema.movieArray;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PC
 */
public class MoviesRemove extends JFrame{
   
    
    private JPanel m1 ;
    private JList list;
   private JButton b1;
   private JLabel l1;
  
    
    
    public MoviesRemove()
    {
        
     Movie nm = new Movie();
     String MovieNames [] = new String [movieArray.size()];
     int i = 0;
     for(Movie xx : movieArray)
     {
         MovieNames[i]=xx.getName();
     }
     m1 = new JPanel();
     m1.setLayout(null); 
    setTitle("Remove Movie");
    setBounds(300,225,500,400);
    this.add(m1);
  l1 = new JLabel("Select Movie To Delete:");
    b1 = new JButton("Delete Movie");
    list = new JList (MovieNames);
    list.setBounds(190, 110, 100, 30);
    b1.setBounds(170, 250, 130, 50);
    l1.setBounds(30, 100, 150, 50);
    
    m1.add(b1);
      m1.add(list);
    m1.add(l1);
    b1.addActionListener(new MyHolder());
    }
public class MyHolder implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object ButtonPressed = e.getSource();
            if (ButtonPressed.equals(b1)){
                 for(Movie xx : movieArray)
     {
         if(xx.getName()==list.getSelectedValue());
         movieArray.remove(list.getSelectedValue());
     }
                 
            }
           
                    
                
        }
    }
}

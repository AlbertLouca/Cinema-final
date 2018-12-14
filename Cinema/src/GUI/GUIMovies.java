/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Users.Movie_Data;
import java.awt.Component;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import cinema.Movie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PC
 */
public class GUIMovies extends JFrame 
{
    JPanel g1 ;
    JTextArea MovDes;
    JTextField TFName;
   // JTextField MovDes;
    JRadioButton yes;
    JRadioButton No;
    ButtonGroup group ;
    JLabel is3d ;
    JLabel Time;
    JLabel LName;
    JLabel MovDesL;
     JCheckBox time12P;
     JCheckBox time3;
     JCheckBox time6; 
     JCheckBox time9; 
     JCheckBox time12A; 
     JButton adding_movie;
public GUIMovies(String title)
{
    setTitle(title);
    g1 = new JPanel ();
    g1.setLayout(null);
    setBounds(400,275,500,400);
    add(g1);
      LName = new JLabel("Movie Name:");
      TFName = new JTextField(10);
      yes = new JRadioButton ("Yes");
      No = new JRadioButton ("No");
      is3d = new JLabel("3D:");
      Time = new JLabel("Time Of Play:");
      time12P = new JCheckBox("12:00PM");
      time3 = new JCheckBox("3:00PM");
      time6 = new JCheckBox("6:00PM");
      time9 = new JCheckBox("9:00PM");
      time12A = new JCheckBox("12:00AM");
      MovDes = new JTextArea();
      MovDesL = new JLabel("Movie Details:");
      adding_movie=new JButton("Add Movie");
      
      LName.setBounds(30,18,150,50);
      TFName.setBounds(110, 32 ,90, 24);
      yes.setBounds(110, 80, 50, 20);
      No.setBounds(110,100,50,20);
      is3d.setBounds(30, 70, 150, 50);
      time12P.setBounds(110, 135, 75, 20);
      time3.setBounds(185, 135, 70, 20);
      time6.setBounds(255, 135, 70, 20);
      time9.setBounds(325, 135, 70, 20);
      time12A.setBounds(395, 135, 75, 20);
      Time.setBounds(30, 120, 150, 50);
      MovDes.setBounds(115, 190 ,250, 80);
      MovDesL.setBounds(30, 180, 150, 50);
    adding_movie.setBounds(190,300,100,40);
      
      
      g1.add(time9);
      g1.add(time12A);
      g1.add(time12P);
      g1.add(time3);
      g1.add(time6);
      g1.add(yes);
      g1.add(No);
      g1.add(LName);
      g1.add(TFName);
      g1.add(is3d);
      g1.add(Time);
      g1.add(MovDes);
      g1.add(MovDesL);
      g1.add(adding_movie);
      
      TFName.getText();
      
     group = new ButtonGroup();
     group.add(yes);
     group.add(No);
      adding_movie.addActionListener(new myHoldere());
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);}
       public class myHoldere implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent ae) {
            Object ButtonPresseds =ae.getSource();
            if(ButtonPresseds.equals(adding_movie)){
               Movie_Data n = new Movie_Data();
               n.save();
                JOptionPane.showMessageDialog(null, "Saved");
               setVisible(false);
                
      
  //  g1.setVisible(true);
}
        }
       }
}

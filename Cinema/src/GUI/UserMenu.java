/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author MHDSA
 */
public class userMenu extends JFrame
{

    JButton displayNowPlay;
    JButton displayUpcoming;
    JButton schedule;
    JButton reserve;
    JButton changeUserName;
    JButton chanegePassword;
    JButton logout;
    JLabel welcomeLabel;
    JButton exit;
    JPanel jp;
 
    
    //JLabel datelabel;
   // JComboBox choosedate;
   // JLabel timeLabel;
   // JRadioButton []time;
    //JButton displayHallSeats;
    //JCheckBox [][]reserveSeats;

    public userMenu() 
    {
        
        setTitle("User menu");
        setSize(400, 600);
        jp=new JPanel(new FlowLayout());
        add(jp);
        displayNowPlay=new JButton("Now Playing");
        displayUpcoming=new JButton("Upcoming");
        schedule=new JButton("Schedule");
        reserve=new JButton("Reserve");
        changeUserName=new JButton("Change UserName");
        chanegePassword=new JButton("Change PAssword");
        logout=new JButton("Log out");
        welcomeLabel=new JLabel("Welcome,...");
        //welcomeLabel.setBounds(550, 0, 550, 30);

        
        jp.add(welcomeLabel);
        jp.add(displayNowPlay);
        jp.add(displayUpcoming);
        jp.add(schedule);
        jp.add(reserve);
        jp.add(changeUserName);
        jp.add(chanegePassword);
        jp.add(logout);
        jp.add(exit);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
   
    
}

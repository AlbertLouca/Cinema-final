
package GUI;
        
import Users.User;
import java.awt.FlowLayout;
import javax.swing.*;

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
    JPanel jp;
 
    
    //JLabel datelabel;
   // JComboBox choosedate;
   // JLabel timeLabel;
   // JRadioButton []time;
    //JButton displayHallSeats;
    //JCheckBox [][]reserveSeats;

    public userMenu(User user) 
    {
        
        setTitle("User menu");
       setBounds(400,100,400,250);
        jp=new JPanel(null);
        add(jp);
        displayNowPlay=new JButton("Now Playing");
        displayNowPlay.setBounds(10,10,150,30);
        
        displayUpcoming=new JButton("Upcoming");
        displayUpcoming.setBounds(180,10,150,30);
        schedule=new JButton("Schedule");
        schedule.setBounds(10,50,150,30);
        reserve=new JButton("Reserve");
        reserve.setBounds(180,50,150,30);
        changeUserName=new JButton("Change Name");
        changeUserName.setBounds(10,90,150,30);
        chanegePassword=new JButton("Change Password");
        chanegePassword.setBounds(180,90,150,30);
        logout=new JButton("Log out");
        logout.setBounds(110,140,150,30);
      //  welcomeLabel=new JLabel("Welcome,...");
        //welcomeLabel.setBounds(550, 0, 550, 30);

        
       // jp.add(welcomeLabel);
        jp.add(displayNowPlay);
        jp.add(displayUpcoming);
        jp.add(schedule);
        jp.add(reserve);
        jp.add(changeUserName);
        jp.add(chanegePassword);
        jp.add(logout);

        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Image;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;


/**
 *
 * @author Chadi N. Louca
 */
public class MainMenu extends JFrame {
//private Graphics myg;
    JPanel j1;
    final JButton reg;
    final JButton log;
    ImageIcon background_image;
    public MainMenu(String title) throws IOException{
       background_image=new ImageIcon("C:\\Users\\Chadi N. Louca\\Desktop\\2c6643280ec89c10e0f473807dd3de93.jpg");
       Image img=background_image.getImage();
       Image temp_img=img.getScaledInstance(500,400, Image.SCALE_SMOOTH);

       background_image=new ImageIcon(temp_img);
       JLabel background=new JLabel("",background_image,JLabel.CENTER);
       background.setBounds(0,0,500,400);
      this.add(background);


         setTitle(title);
           j1=new JPanel();
        
           this.add(j1);
           // this.add
            setBounds(300,275,500,400);
  
            log=new JButton("Login");
        reg=new JButton("Register");
        j1.setLayout(null);
        j1.add(log);
       j1.add(reg);
       reg.setBounds(150,200,200,100);
        log.setBounds(150,50,200,100);
        
      
        log.addActionListener(new myHolder());
        reg.addActionListener(new myHolder());
        
          this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
         public class myHolder implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object ButtonPressed =ae.getSource();
            if(ButtonPressed.equals(reg)){
                JUser n=new JUser();
                n.setVisible(true);
              //  setVisible(false);
                
            }
         if(ButtonPressed.equals(log)){
             JLogin n=new JLogin();
             n.setVisible(true);
             setVisible(false);
         }
      
        }       
    }

}

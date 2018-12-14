package cinema;

import GUI.User;
import GUI.MainMenu;
import Users.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Cinema {
    
   public static  HashMap <String,User> hash=new HashMap <String,User>();

    public static void savehash() throws FileNotFoundException, IOException{
        ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream("C:\\Users\\Chadi N. Louca\\Documents\\Cinema\\HashMap.bin"));
        oos.writeObject(hash);
        oos.close();
    }
public static void loadhash() throws  IOException, ClassNotFoundException{
    try{
    ObjectInputStream ois=new ObjectInputStream(new FileInputStream( "C:\\Users\\Chadi N. Louca\\Documents\\Cinema\\HashMap.bin"));
    hash=(HashMap<String,User>)ois.readObject();
    }catch(FileNotFoundException e)
    {}
    
}

   
   public static ArrayList<User> UserLib=new ArrayList<User>();
    
    boolean Exit=false;
     Scanner read=new Scanner(System.in);
     

 public static void main(String[] args) throws IOException,FileNotFoundException, ClassNotFoundException {
     
     
User_Data x=new User_Data();
x.load();
loadhash();
 try
  {
      Clip clip = AudioSystem.getClip();
      clip.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\Chadi N. Louca\\Downloads\\PewDiePie - Bitch Lasagna (Instrumental Remake by iGerman)  FLP.wav")));
      clip.loop(Clip.LOOP_CONTINUOUSLY);
      clip.start();

  }
  catch (IOException | LineUnavailableException | UnsupportedAudioFileException exc)
  {
      exc.printStackTrace(System.out);
  }

MainMenu f=new MainMenu();
f.setVisible(true);


             }   }   


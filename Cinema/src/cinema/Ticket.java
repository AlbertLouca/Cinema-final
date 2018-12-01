package cinema;
import Users.*;
public class Ticket {
private int hallID;
private String moviename;
private char seatgroup;

    public char getSeatgroup() {
        return seatgroup;
    }

    public boolean setSeatgroup(char seatgroup)
    {
        if (seatgroup >= 'A' && seatgroup <= 'G')
        {
         this.seatgroup = seatgroup;
         return true;
        }
        else
        {
        return true;
        }
    }

    public void setTime(Time time)// time eh?
    {
      
             this.time = time;
             
        }
    

    public String getMoviename() {
        return moviename;
    }

    public boolean setMoviename(String moviename)
    {
        if (moviename.length()<=0 &&moviename.length()>=100)
        {
              this.moviename = moviename;
            return true;
        }
        else
        {
        
          return false;
        }
       
    }
    

    public int getPrice() {
        return price;
    }

    public boolean setPrice(int price) 
    {
        if (price < 0 )
        {
            return false;
        }
        else 
        {
          this.price = price;
        return true;
        }
    }
private Time time;
    public Ticket() {
       hallID=0;
       moviename="";
   price=0;
    }

private int price;
    private int ID;
    

    public int getID() {
        return ID;
    }

    public boolean setID(int ID) {
        if (ID>=0)
        {
             ID++;
        this.ID = ID;
        return true;
        }
        else 
             return false ;
                    
                
       
    }
public Time Get_Time (Movie mov) throws Exception {
                    return mov.getTimeOfPlay();
}

    public int getHallID() {
        return hallID;
    }

    public boolean setHallID(int  hallID) 
    {
        if (hallID<=0 && hallID >= 3)
        {
             this.hallID = hallID;
             return true;
        }
        else 
        {
       
        return false; 
        }
    }

}
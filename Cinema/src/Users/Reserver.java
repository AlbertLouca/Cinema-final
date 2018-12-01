package Users;
import java.util.ArrayList;
import cinema.*;
import java.io.Serializable;

public class Reserver extends Schedule implements Serializable {
    public int Price(Payment pay,Time tim , char seatgroup) 
    {
      
      return pay.CalcPrice(pay, tim, seatgroup);
      
    
    }

    public ArrayList<Movie> chooseMovieAndTime(Schedule sch)
    {
return sch.getMovies();
    };

    public boolean reserve(Movie_Data x,Hall hall, char h,int pos)
     {
return x.checkSeatAvailability(hall, pos, h);
        
    }

  
}
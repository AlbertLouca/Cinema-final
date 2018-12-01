package Users;

import java.util.ArrayList;
import cinema.*;
import java.io.Serializable;
public class Online_Client extends Now_Playing implements Serializable {
    

    public ArrayList<Movie> seeNowPlaying()
    {
    return getThisMonthMoviesArray();
    }

    public int giveReservationID(Ticket One) 
    {
        return One.getID();
    }



}
package Users;
import cinema.*;
import java.io.Serializable;





public class Seller extends Reserver implements Serializable{

    private Ticket One;
    protected Ticket SetTicket(Movie mov,int hallID,Payment pay,char seatgroup,Time tim) 
    {
         tim=mov.getTimeOfPlay();
            pay.CalcPrice(mov, tim, seatgroup);
        One.setMoviename(mov.getName());
One.setHallID(hallID);
One.setTime(tim);
One.setSeatgroup(seatgroup);
return One;
    }
}

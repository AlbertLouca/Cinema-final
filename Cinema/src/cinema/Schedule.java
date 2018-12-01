package cinema;
import java.util.ArrayList;
import Users.*;
import java.io.*;

public class Schedule {
   //private Movie movies[]= new Movie[Now_Playing.cap];
   public ArrayList<Movie> movies=new ArrayList<Movie>(Now_Playing.cap);
  
//   public Schedule() {
//       
//        for(int i=0;i<Now_Playing.cap;i++ )  {
//            movies.set(i, e);
//        }
//       
//      }

    public boolean setSchedule(Movie movies[], int userID) {
     if(userID==1){
         for(int i=0;i<Now_Playing.cap*2;i++ ){
             
         this.movies.set(i, movies[i]);
         
         
         }
          
        return true;}
     else{
         return false;
     }
    }
    public boolean update(Movie movie,int userID){
    if(userID==1){
     
   for(int i=0;i<Now_Playing.cap;i++){
   if(movies.get(i)==null){
       movies.set(i, movie);
       return true;
   
  }
  
   }
 
    }
    return false;
    
  }
    public boolean Remove(int movieiD, int userID){
    if (userID==1){
     for(int i=0;i<Now_Playing.cap;i++){
     if(movies.get(i).getID() ==movieiD){
     
     movies.remove(i);
   
     return true ;       
     }
     
     
     }
    
  }

    return false;
    }
 
    public ArrayList<Movie> getMovies(){
        return movies;
}

    
}
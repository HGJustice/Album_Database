 
package albumdatabase;


public class Duration implements Comparable   {
   private int seconds;
   private int minutes;
   private int hours;
    
    
    public void Duration(){
        
        this.seconds = 0;
        this.minutes = 0;
        this.hours = 0;
        
    }
    
    public void Duration(int sec, int min, int h) {
    
        this.seconds = sec;
        this.minutes = min;
        this.hours = h;
        
}
    
    
   public void Duration(String str){
       String[] List = str.split(":");
       hours = Integer.parseInt(List[0]);
       minutes = Integer.parseInt(List[1]);
       seconds = Integer.parseInt(List[2]);
   }
   
    public String toString(){
   
        String h = Integer.toString(hours);
        String min = Integer.toString(minutes);
        String sec = Integer.toString(seconds);
        
        String Duration = (h + ":" + min + ":" + sec);
        
        return Duration;
    }
    
    
    public int getSec(){
        return seconds;
    }
    public int getMin(){
        return minutes;
    }
    public int getHours(){
        return hours;
    }
    
    
    public void add(Duration d1) {
     this.seconds=+ d1.seconds;
     this.minutes=+ d1.minutes;
     this.hours=+d1.hours;
        
}

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

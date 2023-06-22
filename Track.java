
package albumdatabase;


public class Track {
    private String TrackTitle;
    private Duration duration1;
   
    
public void Track(String Ttitle, Duration trackLength){

 this.TrackTitle = Ttitle;             //Constructor for the Track Class
 this.duration1 = trackLength;
}



 public String getTitle() {
    return TrackTitle;            //Returns TrackTitle
}
 public Duration getDuration(){
     return duration1;           // Returns Duration
}
}
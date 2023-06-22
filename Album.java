

package albumdatabase;
import java.util.ArrayList;

public class Album {
    
   private String ArtistName;
   private String AlbumName;
    
public void Album(String Album, String Artist){
    this.ArtistName = Artist;
    this.AlbumName = Album;
}

ArrayList<Track> Array1  = new ArrayList<>();
ArrayList<Track>  Array2 = new ArrayList<>();

public void add(Track artistName, Track trackName){
    Array1.add(artistName);
    Array2.add(trackName);
}
       


public String getAlbum(){
    return AlbumName;
}
public String getArtist(){
    return ArtistName;
}
}

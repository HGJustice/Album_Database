package albumdatabase;
import java.util.*;
import java.io.File;



public class AlbumCollection {

    private Scanner x;
    
    
    ArrayList myArray = new ArrayList();
    
    public void openFile(){
        try{
            x = new Scanner(new File ("albums.txt"));
        } catch(Exception e){
            System.out.println("could not find file");
        }
    }
  public void readFile(){
      while(x.hasNext()){
         
          String a = x.next();
          String b = x.next();
          String c = x.next();
          
          System.out.printf("%s %s %s\n", a,b,c);
      }
}
  public void closeFile(){
      x.close();
  }
}
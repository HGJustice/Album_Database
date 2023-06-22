
package albumdatabase;
import java.util.*;
import java.io.File;


public class AlbumDatabase {

  
    public static void main(String[] args) {
        
        
     AlbumCollection r = new AlbumCollection();
     r.openFile();
     r.readFile();
     r.closeFile();
      
   //   Scanner scan = null;
      
      //  try {
           // scan = new Scanner(fileName);
          //  System.out.println(scan.nextLine());
     
       // } catch (FileNotFoundException ex) {
           // Logger.getLogger(AlbumDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    


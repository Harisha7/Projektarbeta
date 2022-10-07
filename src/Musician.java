import java.util.ArrayList;
import java.util.HashMap;

public class Musician {
    
    
    ArrayList<Band> currentBands = new ArrayList<>();
    
    ArrayList<Band> oldBands = new ArrayList<>();
    
    HashMap<Album, String> soloAlbum = new HashMap<>();
    
    ArrayList<String> instruments = new ArrayList<>();
    
    
    public Musician(String name, String infoText, int yearOfBirth){
        this.name = name;
        this.infoText = infoText;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName(){

        return name;
    }

    public String getInfoText(){

        return infoText;
    }
    public int getYearOfBirth(){

        return yearOfBirth;
    }
     public ArrayList<Band> getCurrentBands(){
         return currentBands;
     }
    
    public void setCurrentBands(ArrayList<Band>currentBands){
        this.currentBands = currentBands;
    }
    
    public ArrayList<Band> getOldBands(){
         return oldBands;
     }
    
    public void setOldBands(ArrayList<Band>currentBands){
        this.oldBands = oldBands;
    }
    
    public HashMap<Album, String> getSoloAlbum(){
        return soloAlbum;
    }
    
    public void setSoloAlbum(HashMap<Album,String> soloAlbum){
        this.soloAlbum = soloAlbum;
    }
    
    public ArrayList<String> getInstruments(){
         return instruments;
     }
    
    public void setInstruments(ArrayList<String> instruments){
        this.instruments = instruments;
    }
}

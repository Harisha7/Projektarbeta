import java.util.ArrayList;
import java.util.HashMap;
import java.util.Calendar;


public class Musician extends BasicInfo {
    private String infoText;

    private ArrayList<Band> currentBands = new ArrayList<>();
    
    private ArrayList<Band> oldBands = new ArrayList<>();
    
    private ArrayList<Album> soloAlbum = new ArrayList<>();

    private ArrayList<String> instruments = new ArrayList<>();

    public Musician(String name, String genres, int year, String infoText) {
        super(name, genres, 0, year);
        this.infoText = infoText;
    }

    public String getInfoText(){

        return infoText;
    }

    public int getAge(){
        Calendar date = Calendar.getInstance();
        int  age = date.get(Calendar.YEAR) - this.getYear();
        return age;
    }

    public ArrayList<Band> getCurrentBands(){

        return currentBands;
     }
    
    public void setCurrentBands(Band band){

        this.currentBands.add(band);
    }
    
    public ArrayList<Band> getOldBands(){

        return oldBands;
     }
    
    public void setOldBands(Band band){

        this.oldBands.add(band);
    }
    
    public ArrayList<Album> getSoloAlbums(){

        return soloAlbum;
    }
    
    public void setSoloAlbum(Album album){

        soloAlbum.add(album);
    }
    
    public ArrayList<String> getInstruments(){

        return instruments;
     }

    public void setInstruments(ArrayList<String> instruments){

        this.instruments = instruments;
    }

    @Override
    public String toString() {
        return "Name: " +  getName() + ", InfoText: " + getInfoText() + ", YearOfBirth: " + getYear() + ", Instruments played: " + getInstruments() + ", Age: " + getAge();
    }
}

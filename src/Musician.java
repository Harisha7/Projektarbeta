import java.util.ArrayList;
import java.util.HashMap;
import java.util.Calendar;


public class Musician extends BasicInfo {
    private String infoText;

    private ArrayList<Band> currentBands = new ArrayList<>();
    
    private ArrayList<Band> oldBands = new ArrayList<>();
    
    private HashMap<Album, String> soloAlbum = new HashMap<>();

//    public ArrayList<Musician> musicianList = new ArrayList<>();
    
    private ArrayList<String> instruments = new ArrayList<>();

    public Musician(String name, String genres, int year, String infoText) {
        super(name, genres, 0, year);
        this.infoText = infoText;
    }
    
    /*public Musician(String name, String infoText, int yearOfBirth){
        this.name = name;
        this.infoText = infoText;
        this.yearOfBirth = yearOfBirth;
    }*/



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

/*
    public void showMusicianList() {
        for(Musician musician :musicianList){
            System.out.println(musician.getName() + " " + musician.getYear());
        }
    }

    public void getMusicianInfo() {
        System.out.println(getName() + "," + getAge() + "," + getInstruments());
    }
*/

    @Override
    public String toString() {
        return "Name: " +  getName() + ", InfoText: " + getInfoText() + ", YearOfBirth: " + getYear() + ", Instruments played: " + getInstruments() + ", Age: " + getAge();
    }
}

import java.util.ArrayList;
import java.util.HashMap;


public class Musician extends BasicInfo {
    private String infoText;

    public ArrayList<Band> currentBands = new ArrayList<>();
    
    public ArrayList<Band> oldBands = new ArrayList<>();
    
    HashMap<Album, String> soloAlbum = new HashMap<>();

    public ArrayList<Musician> musicianList = new ArrayList<>();
    
    ArrayList<String> instruments = new ArrayList<>();

    public Musician(String name, String genres, int numberOfMembers, int year, String infoText) {
        super(name, genres, numberOfMembers, year);
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

    public void addMusician(Musician musician){
        musicianList.add(musician);
    }

    public void removeMusician(String name){
        for(Musician musician: musicianList){
            if(musician.getName() == name){
            musicianList.remove(musician);
            }
        }
        showMusicianList();
    }

    public void showMusicianList() {
        for(Musician musician :musicianList){
            System.out.println(musician.getName() + " " + musician.getYear());
        }
    }

    @Override
    public String toString() {
        return "name" +  getName() + "infoText" + getInfoText() + "yearOfBirth" + getYear() + "Instruments played" + getInstruments();
    }
}

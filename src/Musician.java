import java.util.ArrayList;
import java.util.HashMap;
import java.util.Calendar;


public class Musician {

    private String name;
    private String artistName;
    private String info;
    private int birthYear;

    private String instrument;

    private ArrayList<Band> currentBands = new ArrayList<>();
    
    private ArrayList<Band> oldBands = new ArrayList<>();

    private ArrayList<Album> albums = new ArrayList<>();
    
    private ArrayList<Album> soloAlbum = new ArrayList<>();

    private ArrayList<String> instruments = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setArtistName(String ArtistName) {
        this.artistName = artistName;
    }
    public String getArtistName() {
        return artistName;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }



    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int getBirthYear() {
        return birthYear;
    }

    private int Age(int birthYear){
        return  2022 - birthYear;
    }



    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
    public String getinstrument() {
        return instrument;
    }


    public void setCurrentBands(ArrayList<Band> currentBands) {
        this.currentBands = currentBands;
    }


    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public Musician(String name, String info, Integer birthYear, String instrument) {
        setName(name);
        setInfo(info);
        setBirthYear(birthYear);
        setInstrument(instrument);
    }
    public Musician(String name, String info, Integer birthYear, String Instrument, ArrayList<Band>currentBands,ArrayList<Band>pastBands,ArrayList<Album>albums) {
        setName(name);
        setInfo(info);
        setBirthYear(birthYear);
        setInstrument(instrument);
        setCurrentBands(currentBands);
        this.oldBands = pastBands;
        this.albums=albums;
    }



    public void showMusicianInfo(){
        System.out.println("The Musician name is "+ getName());
        System.out.println("The Musician information is " + getInfo());
        System.out.println("the Musicians age is " +getBirthYear());
        if (currentBands.size() !=0 ){
            System.out.println("The current band musician is in:  ");
        }
        else{
            System.out.println("The musician is not in a band currently");
        }
        if(oldBands.size() > 0){
            System.out.println("The musicians old bands are :");
        }
        else{
            System.out.println("there are no old bands for this musician: ");
        }


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

    public void showInstruments(){
        for (Musician musician : instrument){
            System.out.println(musician.getInfo());
        }
    }

    /*@Override
    public String toString() {
        return "Name: " +  getName() + ", InfoText: " + getInfoText() + ", YearOfBirth: " + getYear() + ", Instruments played: " + getInstruments() + ", Age: " + getAge();
    }*/
}

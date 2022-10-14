import java.util.ArrayList;
import java.util.HashMap;
import java.util.Calendar;


public class Musician extends Item {

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
    public void addInstrument(String instrument){
        instruments.add(instrument);
    }

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

    private int getAge(){
        return  2022 - birthYear;
    }



    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
    public String getInstrument() {
        return instrument;
    }


    public void setCurrentBands(Band band) {
        currentBands.add(band);
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
    public Musician(String name, String info, Integer birthYear, String Instrument, ArrayList<Band> currBandsList,ArrayList<Band> pastBands,ArrayList<Album> albums) {
        setName(name);
        setInfo(info);
        setBirthYear(birthYear);
        setInstrument(instrument);
        currentBands = currBandsList;
        oldBands = pastBands;
        albums=albums;
    }

    public void showMusicianInfo(){
        System.out.println("The Musician name is "+ getName());
        System.out.println("The Musician information is " + getInfo());
        System.out.println("the Musicians age is " + getAge() + " years old");
        if (currentBands.size() !=0 ){
            System.out.println("The current band musician is in:  ");
            for (Band band : currentBands){
                System.out.println(band.getBandName());
            }
        }
        else{
            System.out.println("Musician is not in any band currently");
        }

        if(oldBands.size() > 0){
            System.out.println("Musician old bands are:");
            for (Band band : oldBands){
                System.out.println(band.getBandName());
            }
        }
        else{
            System.out.println("there are no old bands for this musician: ");
        }

        if(soloAlbum.size() > 0){
            System.out.println("Musician solo albums are:");
            for (Album album : soloAlbum){
                System.out.println(album.getName());
            }
        }
        else {
            System.out.println("There are no solo albums for this musician: ");
        }
    }

    public ArrayList<Band> getCurrentBands(){

        return currentBands;
     }

    public ArrayList<Band> getOldBands(){

        return oldBands;
     }
    
    public void setOldBands(Band band){

        oldBands.add(band);
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

        for (String instrument : instruments){
            System.out.println(instrument);
        }
    }

    /*@Override
    public String toString() {
        return "Name: " +  getName() + ", InfoText: " + getInfoText() + ", YearOfBirth: " + getYear() + ", Instruments played: " + getInstruments() + ", Age: " + getAge();
    }*/
}

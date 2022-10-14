import com.google.gson.annotations.JsonAdapter;
import java.util.ArrayList;


public class Musician extends Item {

    private String name;
    private String artistName;
    private String info;
    private int birthYear;

    private String instrument;


    @JsonAdapter(ItemListAdapter.class)
    private ArrayList<Band> currentBands = new ArrayList<>();

    @JsonAdapter(ItemListAdapter.class)
    private ArrayList<Band> oldBands = new ArrayList<>();

    @JsonAdapter(ItemListAdapter.class)
    private ArrayList<Album> albums = new ArrayList<>();

    @JsonAdapter(ItemListAdapter.class)
    private ArrayList<Album> soloAlbum = new ArrayList<>();

    @JsonAdapter(ItemListAdapter.class)
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

    public void setInfo(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }



    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    
    private int getAge(){
        return  2022 - birthYear;
    }



    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setCurrentBands(Band band) {
        currentBands.add(band);
    }



    
    public Musician(String name, String info, Integer birthYear, String instrument) {
        setName(name);
        setInfo(info);
        setBirthYear(birthYear);
        setInstrument(instrument);
        ItemStore.add(this);
    }
    public Musician(String name, String info, Integer birthYear, String Instrument, ArrayList<Band> currBandsList,ArrayList<Band> pastBands,ArrayList<Album> albums) {
        setName(name);
        setInfo(info);
        setBirthYear(birthYear);
        setInstrument(instrument);
        currentBands = currBandsList;
        oldBands = pastBands;
        albums=albums;
        ItemStore.add(this);
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

    
    public void setOldBands(Band band){

        oldBands.add(band);
    }
    
    
    public void setSoloAlbum(Album album){

        soloAlbum.add(album);
    }
    
    

}

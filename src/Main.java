import com.google.gson.annotations.JsonAdapter;
import java.util.*;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class Main {
    public static ArrayList<Band> bands = new ArrayList<>();
    public static ArrayList<Album> albums = new ArrayList<>();
    public static ArrayList<Musician> musicians = new ArrayList<>();

    public static Scanner read = new Scanner(System.in);


    @JsonAdapter(ItemListAdapter.class)
    public static List<Band> bandList = new ArrayList<>();
    public static void main(String[] args) {
        int userInput;
        boolean exitLoop = false;
        if (!FileHandler.fileExists("data.json")) {
            ItemStore.save("data.json");
            ItemStore.log();
            System.out.println("file created");
        }
        else loadData();

        do{
            userInput = menuChoice();
            switch (userInput){
                case 1: //Show Musicians
                    showMusicianMenu();
                    break;
                case 2: //Show Albums
                    showAlbumMenu();
                    break;
                case 3: //Show Bands
                    showBandMenu();
                    break;
                default:
                    exitLoop = true;
            }

            if (exitLoop) {
                break;
            }
        } while (true);

        System.out.println("Bye!.. :)");

      //json

    }
    //json
    private static void loadData(){
        // Read all data to the store
        ItemStore.load("data.json");
        // Log the whole store
        //ItemStore.log();
        System.out.println("data loaded");
        //print previous data

    }
    //json
    private static void saveData(){
        ItemStore.save("data.json");
        ItemStore.log();
    }
    //json
    public static void getSaveData(){
        saveData();
    }
    public static void showBandMenu(){
        int userInput;
        boolean exitLoop = false;
        do{
            userInput = menuChoiceBand();
            switch (userInput){
                case 1:
                    showBand(); //Show Bands
                    break;
                case 2:  // Add Band
                    addBand();
                    break;
                case 3: //Remove Band
                    //removeBand();
                    break;
                default:
                    exitLoop = true;
            }
            if (exitLoop) {
                break;
            }
        } while (true);
    }
    private static int menuChoiceBand(){
        System.out.println("\n".repeat(1));
        System.out.println("Please choose an option 1-4" + "\n 1. Show Band" +
                "\n 2. Add Band" + "\n 3. remove Band" + "\n 4. Quit");
        return read.nextInt();
    }

    public static void showMusicians() {
        for (Musician dispMusician : musicians) {
            dispMusician.showMusicianInfo();
        }
    }

    public static void showMusicianMenu(){
        int userInput;
        boolean exitLoop = false;
        do{
            userInput = menuChoiceMusician();
            switch (userInput){
                case 1:
                    showMusicians(); //Show musicians
                    break;
                case 2:  // Add Musician
                    addMusician();
                    break;
                case 3://Remove Musician
                    System.out.println("Enter the name of the artist you want to remove: ");
                    read = new Scanner(System.in);
                    String artistName = read.nextLine();
                    removeMusician(artistName);
                    break;
                case 4: //Add musician to band
                    addMusicianToBand();
                    break;
                case 5: //Retire musician from band
                    retireMusicianFromBand();
                    break;
                default:
                    exitLoop = true;
            }
            if (exitLoop) {
                break;
            }
        } while (true);
    }
    private static int menuChoiceMusician(){
        System.out.println("\n".repeat(1));
        System.out.println("Please choose an option 1-4" + "\n 1. Show Musician" +
                "\n 2. Add Musician" + "\n 3. remove Musician" +"\n 4. Add Musician to Band" + "\n 5. Retire Musician from Band" + "\n 6. Quit");
        return read.nextInt();
    }
    public static void showAlbumMenu(){
        int userInput;
        boolean exitLoop = false;
        do{
            userInput = menuChoiceAlbum();
            switch (userInput){
                case 1:
                    showAlbum();
                    break;
                case 2:
                    addAlbum();
                    break;
                case 3:
                    addSoloAlbum();
                    break;
                case 4:
                    removeAlbum();
                    break;
                default:
                    exitLoop = true;
            }
            if (exitLoop) {
                break;
            }
        } while (true);
    }
    private static int menuChoiceAlbum(){
        System.out.println("\n".repeat(1));
        System.out.println("Please choose an option 1-4" + "\n 1. Show Album" +
                "\n 2. Add Album" + "\n 3. Add Solo Album" + "\n 4. remove Album" + "\n 5. Quit");
        return read.nextInt();
    }
    public static void addInstrumentToMusician(Musician m){
        read = new Scanner(System.in);
        m.addInstrument(read.nextLine());
        System.out.println("Which instrument do you want to add? ");


    }
    public static void addBand(){
        System.out.println("Add a band in this format: Name, Info, Year of band formed YYYY, disbanded year");
        read = new Scanner(System.in);
        String userTypeBand = read.nextLine();
        String[] userInput = userTypeBand.split(",\\s*");
        try{
              Band band = new Band(userInput[0],userInput[1] , Integer.parseInt(userInput[2]) , Integer.parseInt(userInput[3]));
              bands.add(band);

        }
        catch(Exception e){
            System.out.println("Bad input");
        }
    }

    public static void addMusician (){
        System.out.println("Add musician in this format: name, info, birth year,instrument ");
        read = new Scanner(System.in);
        String userTypeMusician = read.nextLine();
        String[] userInput = userTypeMusician.split(",\\s*");
        try {
            Musician musician = new Musician(userInput[0], userInput[1], Integer.parseInt(userInput[2]),
                    userInput[3]);
            musicians.add(musician);
        }
        catch(Exception e){
            System.out.println("Bad input");
        }


    }
    // Add function to disallow empty character input
    public static void addAlbum (){
        System.out.println("Add a album in this format: Album name, Band name, Album info, year of release");
        read = new Scanner(System.in);
        String userTypeAlbum = read.nextLine();
        String[] userInput = userTypeAlbum.split(",\\s*");

        try {
            Album album = new Album(userInput[0], userInput[1], userInput[2], Integer.parseInt(userInput[3]));
            albums.add(album);
        }
        catch(Exception e){
            System.out.println("Bad input");
        }


        boolean albumCreated = false;
        for (Band band : bands){
            if(band.getBandName().matches(userInput[1])){
                Album album = new Album(userInput[0],userInput[1] , userInput[2] ,
                        Integer.parseInt(userInput[3]));
                band.addAlbumToBand(album);
                albums.add(album);
                albumCreated = true;
                break;
            }
        }
        if (!albumCreated){
            System.out.println("Enter valid Band");
        }
    }
    public static void addSoloAlbum(){
        System.out.println("Add a album in this format: Album name, Musician name, Album info, year of release");
        read = new Scanner(System.in);
        String userTypeAlbum = read.nextLine();
        String[] userInput = userTypeAlbum.split(",\\s*");

        try {
            Album album = new Album(userInput[0], userInput[1], userInput[2], Integer.parseInt(userInput[3]));
            albums.add(album);
        }
        catch(Exception e){
            System.out.println("Bad input");
        }

        boolean albumCreated = false;
        for (Musician artist : musicians){
            if(artist.getName().matches(userInput[1])){
                Album album = new Album(userInput[0],userInput[1] , userInput[2] ,
                        Integer.parseInt(userInput[3]));
                artist.setSoloAlbum(album);
                albums.add(album);
                albumCreated = true;
                break;
            }
        }
        if (!albumCreated){
            System.out.println("Enter valid Musician name");
        }
    }

    public static void showBand() {
        for (Band dispBand : bands) {
            dispBand.showBandInfo();
        }
    }

    private static int menuChoice(){
        System.out.println("\n".repeat(1));
        System.out.println("Please choose an option 1-4" + "\n 1. Show Musician Menu" +
                "\n 2. Show Album Menu" + "\n 3. Show Band Menu" + "\n 4. Quit");
        return read.nextInt();
    }

    public static void removeMusician(String name) {
        for (Musician artistName : musicians){
            if (artistName.getName().matches(name)) {
                musicians.remove(artistName);
                System.out.println("Deleted artist: " + artistName.getName());
                break;
            }
        }
    }
    // I removed the current
    public static void showAlbum() {
        for (Album dispAlbum : albums) {
            dispAlbum.showAlbumInfo();
        }
    }
    // Add function to disallow empty character input


    //Show list of band first, then give user option to delete based on order in list
   public static void removeBand() {
        for (Band dispBand : bands) {
            System.out.println(dispBand.getBandInfo());
        }
        System.out.println("Remove a band by typing the name of the band");
        read = new Scanner(System.in);
        String userRemoveBand = read.nextLine();
        int bandToRemove = -1;
        for (Band disBand : bands){
            if (disBand.getBandName().equals(userRemoveBand)){
                bandToRemove = bands.indexOf(disBand);
            }
        }
        if (bandToRemove >= 0 ){
            bands.remove(bandToRemove);
        }
    }



    //Show list of Album first, then give user option to delete based on order in list
    public  static void removeAlbum() {
        for (Album dispAlbum : albums) {
            System.out.println(dispAlbum.getArtist());
        }
        System.out.println("Remove a album by typing the name of the album");
        read = new Scanner(System.in);
        String userRemoveAlbum = read.nextLine();
        int albumToRemove = -1;
        for (Album disAlbum : albums){
            if (disAlbum.getName().equals(userRemoveAlbum)){
                albumToRemove = albums.indexOf(disAlbum);
            }
        }
        if (albumToRemove >= 0 ){
            albums.remove(albumToRemove);
        }
    }

    public static void addMusicianToBand(){
        System.out.println("Enter Band and Musician to add in this format: Band name, Musician name");
        read = new Scanner(System.in);
        String userTypeBandMusician = read.nextLine();
        String[] userInput = userTypeBandMusician.split(",\\s*");
        boolean musicianFound = false;

        for (Band band : bands) {
            if (band.getBandName().matches(userInput[0])) { //finding matching band
                for (Musician artist : musicians) {
                    if (artist.getName().matches(userInput[1])) { //finding matching Musician
                        band.addMusicianToBand(artist);
                        artist.setCurrentBands(band);
                        musicianFound = true;
                        break;
                    }
                }
                if (musicianFound) {
                    break;
                }
            }
        }
        if (!musicianFound)
        {
            System.out.println("Enter valid Band & Musician names");
        }
    }

    public static void retireMusicianFromBand(){
        System.out.println("Enter Band name and Musician to retire from band in this format: Band name, Musician name");
        read = new Scanner(System.in);
        String userTypeBandMusician = read.nextLine();
        String[] userInput = userTypeBandMusician.split(",\\s*");
        boolean musicianFound = false;

        for (Band band : bands) {
            if (band.getBandName().matches(userInput[0])) { //finding matching band
                for (Musician artist : musicians) {
                    if (artist.getName().matches(userInput[1])) { //finding matching Musician
                        band.removeMusicianFromBand(artist);
                        artist.getCurrentBands().remove(band);
                        artist.setOldBands(band);
                        musicianFound = true;
                        break;
                    }
                }
                if (musicianFound) {
                    break;
                }
            }
        }
        if (!musicianFound)
        {
            System.out.println("Enter valid Band & Musician names");
        }
    }
}

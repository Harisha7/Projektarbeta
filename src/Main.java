import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;

public class Main {
    public static ArrayList<Band> bands = new ArrayList<>();
    public static ArrayList<Album> albums = new ArrayList<>();
    public static ArrayList<Musician> musicians = new ArrayList<>();

    public static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int userInput;
        boolean exitLoop = false;

        do{
            userInput = menuChoice();
            switch (userInput){
                case 1: //Show Bands & Musicians
                    showMusicians();
                    break;
                case 2: //Show Albums
                    break;
                case 3: //Add Musician
                    addMusician();
                    break;
                case 4: //Add Album
                    break;
                case 5: //Remove Band
                    break;
                case 6: //Remove Musician
                    System.out.print("Enter Musician name to delete: ");
                    removeMusician(read.next());
                    break;
                case 7: //Remove Album
                    break;
                case 8:
                default:
                    exitLoop = true;
            }

            if (exitLoop) {
                break;
            }
        } while (true);

        System.out.println("Bye!.. :)");
    }

    private static void showMusicians(){
        for(Musician artist : musicians){
            System.out.println(artist);
        }
    }
    public static void addMusician(){
        String artistName, genre, infoText;
        int yob;

        System.out.print("Enter Musician name: ");
        artistName = read.next();
        System.out.print("Enter Musician genre: ");
        genre = read.next();
        System.out.print("Enter Musician Year of Birth(YYYY): ");
        yob = read.nextInt();
        System.out.print("Enter Information about Musician : ");
        infoText = read.next();
//        System.out.println("Enter Musician Instruments list : ");
//        instruments = read.next();
        Musician musician = new Musician(artistName, genre, yob , infoText);
        musicians.add(musician);
    }

    private static int menuChoice(){
        System.out.println("\n".repeat(1));
        System.out.println("Please choose an option 1-9" + "\n 1. Show Bands and Musicians" +
                "\n 2. Show Albums" + "\n 3. Add Musician" + "\n 4. Add Album" +
                "\n 5. Remove Bands" + "\n 6. Remove Musician" + "\n 7. Remove Album" + "\n 8. Quit");
        return read.nextInt();
    }

    public static void removeMusician(String name) {
        for (Musician artist : musicians){
            if (artist.getName().matches(name)) {
                musicians.remove(artist);
                System.out.println("Deleted artist: " + artist.getName());
                break;
            }
        }
    }

    /*
    public static int showBand() {
        for (BasicInfo dispBand : bands) {
            System.out.println(dispBand.getInfo());
        }
        for (BasicInfo dispMusician : musicians) {
            System.out.println(dispMusician.getInfo());

        }
        System.out.println("Return to main menu (1)");
        int userChoice = userInt.nextInt();
        if (userChoice == 1) {
            mainMenu();
        }
        return userChoice;
    }
    // I removed the current
    public static int showAlbum (){
        for (Album dispAlbum : albums) {
            System.out.println(dispAlbum.getAlbum());
        }
        System.out.println("Return to main menu (1)");
        int userChoice = userInt.nextInt();
        if (userChoice == 1){
            mainMenu();
        }
        return userChoice;
    }
    // Add function to disallow empty character input
    public static int addAlbum (){
        String userTypeAlbum = userInt.next();
        System.out.println("Add an Album in this format: Song name, artist name, album name, year of release NNNN");
        Album album = new Album("songName", "artistName", "albumName", 1980  );
        albums.add(album);
        return albums.size();
    }

    //Show list of band first, then give user option to delete based on order in list
    public static int removeBand() {
        for (BasicInfo dispBand : bands) {
            System.out.println(dispBand.getInfo());
        }
        System.out.println("Remove a band by typing the order of the band, top = 1");
        int userRemoveBand = userInt.nextInt();
        bands.remove((userRemoveBand) - 1);
        return userRemoveBand;
    }

    //Show list of Musician first, then give user option to delete based on order in list
    public static int removeMusician() {
        for (BasicInfo dispMusician : musicians) {
            System.out.println(dispMusician.getInfo());
        }
        int userRemoveMusician = userInt.nextInt();
        musicians.remove((userRemoveMusician) - 1);
        return userRemoveMusician;
    }

    //Show list of Album first, then give user option to delete based on order in list
    public  static int removeAlbum() {
        for (Album dispAlbum : albums) {
            System.out.println(dispAlbum.getAlbum());
        }
        int userRemoveAlbum = userInt.nextInt();
        albums.remove((userRemoveAlbum) - 1);
        return userRemoveAlbum;

    }
  */
}

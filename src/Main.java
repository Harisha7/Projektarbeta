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
                    showAlbum();
                    break;
                case 3:
                    showBand();
                    break;
                case 4: //Add Musician
                    addMusician();
                    break;
                case 5: //Add Album
                    addAlbum();
                    break;
                case 6:
                    addBand();
                    break;
                case 7: //Remove Band
                    removeBand();
                    break;
                case 8: //Remove Musician
                    System.out.print("Enter Musician name to delete: ");
                    removeMusician(read.next());
                    break;
                case 9: //Remove Album
                    removeAlbum();
                    break;
                case 10:
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

    public static void addBand(){
        System.out.println("Add a band in this format: Name, Info, Year of birth NNNN, end year");
        read = new Scanner(System.in);
        String userTypeBand = read.nextLine();
        String[] userInput = userTypeBand.split(", ");
        Band band = new Band(userInput[0],userInput[1] , Integer.parseInt(userInput[2]) , Integer.parseInt(userInput[3]));
        bands.add(band);

    }
    // Add function to disallow empty character input
    public static void addAlbum (){
        System.out.println("Add a album in this format: title, name, album name, year of release");
        read = new Scanner(System.in);
        String userTypeAlbum = read.nextLine();
        String[] userInput = userTypeAlbum.split(", ");
        Album album = new Album(userInput[0],userInput[1] , userInput[2] , Integer.parseInt(userInput[3]));
        albums.add(album);

    }

    private static int menuChoice(){
        System.out.println("\n".repeat(1));
        System.out.println("Please choose an option 1-10" + "\n 1. Show Musicians" +
                "\n 2. Show Albums" + "\n 3. Show Band" + "\n 4. Add Musician" + "\n 5. Add Album" +
                "\n 6. Add Band" + "\n 7. Remove Bands" + "\n 8. Remove Musician" + "\n 9. Remove Album" + "\n 10. Quit");
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


    public static void showBand() {
        for (Band dispBand : bands) {
            System.out.println(dispBand.getInfo());
        }


    }
    // I removed the current
    public static void showAlbum (){
        for (Album dispAlbum : albums) {
            System.out.println(dispAlbum.getAlbum());
        }

    }
    // Add function to disallow empty character input


    //Show list of band first, then give user option to delete based on order in list
    public static void removeBand() {
        for (Band dispBand : bands) {
            System.out.println(dispBand.getInfo());
        }
        System.out.println("Remove a band by typing the name of the band");
        read = new Scanner(System.in);
        String userRemoveBand = read.nextLine();
        int bandToRemove = -1;
        for (Band disBand : bands){
            if (disBand.getName().equals(userRemoveBand)){
                bandToRemove = bands.indexOf(disBand);
            }
        }
        if (bandToRemove >= 0 ){
            bands.remove(bandToRemove);
        }
    }

    //Show list of Musician first, then give user option to delete based on order in list


    //Show list of Album first, then give user option to delete based on order in list
    public  static void removeAlbum() {
        for (Album dispAlbum : albums) {
            System.out.println(dispAlbum.getAlbum());
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

}

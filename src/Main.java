import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;

public class Main {
    ArrayList<Band> bands = new ArrayList<>();
    ArrayList<Album> albums = new ArrayList<>();
    ArrayList<Musician> musicians = new ArrayList<>();

    Scanner userString = new Scanner(System.in);
    Scanner userInt = new Scanner(System.in);
    public static void main(String[] args) {


    //testdata to test get
    BasicInfo basic1 = new BasicInfo("David", "rock", 0, 2000);
    BasicInfo basic2 = new BasicInfo("Steve", "EDM", 0, 1990);
    Musician musician = new Musician("George", " Rock", 3, 1695 , " New-age");
    Band band1 = new Band ("Jumping rocks", "EDM rap", 2005, 2008);
    Album alb1 = new Album("songName", "artistName", "albumName", 1980  );
    }
    public void mainMenu() {
            System.out.println("\n".repeat(30));
            System.out.println("Please choose an option 1-9" + "\n 1. Show Bands and Musicians" +
                    "\n 2. Show Albums" + "\n 3. Add Musician" + "\n 4. Add Album" +
                    "\n 5. Remove Bands" + "\n 6. Remove Musician" + "\n 7. Remove Album" + "\n 8. Quit");
            //clear terminal
            // 1-7 is for the basic functions required, display/add/delete. Ternary operator
            int menuChoice = userInt.nextInt();
            int userMenu = menuChoice == 1 ? showBand() : menuChoice == 2 ? showAlbum() : menuChoice == 3 ? addMusician() :
                    menuChoice == 4 ? addAlbum() : menuChoice == 5 ? removeBand() : menuChoice == 6 ? removeMusician() :
                            menuChoice == 7 ? removeAlbum() : exitMenu();
        }

    public int exitMenu() {
        System.out.println("Bye");

        return 0;
    }
    public int showBand() {
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
    public int showAlbum (){
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
    // User has to input the whole info in the format of the Musician class
    //here you need to add info about the musician.
    public int addMusician(){
            String userTypeMusician = userInt.next();
            System.out.println("Add a musician in this format: Name, Info, Year of birth NNNN, Instruments played");
        Musician musician = new Musician("George", " Rock", 3, 1695 , " New-age");
            musicians.add(musician);
            return musicians.size();
        }
// Add function to disallow empty character input
    public int addAlbum (){
        String userTypeAlbum = userInt.next();
        System.out.println("Add an Album in this format: Song name, artist name, album name, year of release NNNN");
        Album album = new Album("songName", "artistName", "albumName", 1980  );
                albums.add(album);
                return albums.size();
        }

        //Show list of band first, then give user option to delete based on order in list
    public int removeBand() {
            for (BasicInfo dispBand : bands) {
                System.out.println(dispBand.getInfo());
            }
            System.out.println("Remove a band by typing the order of the band, top = 1");
            int userRemoveBand = userInt.nextInt();
            bands.remove((userRemoveBand) - 1);
        return userRemoveBand;
    }

        //Show list of Musician first, then give user option to delete based on order in list
    public int removeMusician() {
            for (BasicInfo dispMusician : musicians) {
                System.out.println(dispMusician.getInfo());
            }
            int userRemoveMusician = userInt.nextInt();
            musicians.remove((userRemoveMusician) - 1);
        return userRemoveMusician;
        }

        //Show list of Album first, then give user option to delete based on order in list
    public int removeAlbum() {
            for (Album dispAlbum : albums) {
                System.out.println(dispAlbum.getAlbum());
            }
            int userRemoveAlbum = userInt.nextInt();
           albums.remove((userRemoveAlbum) - 1);
           return userRemoveAlbum;

    }
}

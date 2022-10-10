import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    Scanner userInput = new Scanner(System.in);
    Scanner userInt = new Scanner(System.in);
    public static void main(String[] args) {


        //testdata to test get
        BasicInfo basic1 = new BasicInfo("David", "rock", 0, 2000);
        BasicInfo basic2 = new BasicInfo("Steve", "EDM", 0, 1990);
        Musician musician1 = new Musician("George", "New-age", 1980);
        Band band1 = new Band("Jumping rocks", "Rock", 3, 2005, 2015);
        Album alb1 = new Album("songName", "artistName", "albumName", 2005);


    }

        public void mainMenu (){
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

    public int exitMenu () {
        System.out.println("Bye");

    }
    public void showBand () {
        for (BasicInfo dispBand : Band) {
            System.out.println(dispBand.getInfo());
        }
        for (BasicInfo dispMusician : Musician) {
            System.out.println(dispMusician.getInfo());

        }
            System.out.println("Return to main menu (1)");
        Scanner userChoice = new Scanner(System.in);
        int userChoice1 = userChoice.nextInt();
        if (userChoice1 == 1) {
        mainMenu();
        }
    }

    public void showAlbum (){
        for (Album dispAlbum : Album) {
            System.out.println(dispAlbum.getAlbum());
        }
        System.out.println("Return to main menu (1)");
        Scanner userChoice = new Scanner(System.in);
        int userChoice1 = userChoice.nextInt();
        if (userChoice1 == 1) {
        mainMenu();
        }
    }
    // User has to input the whole info in the format of the Musician class
    public void addMusician () {
            System.out.println("Add a musician in this format: Name, Info, Year of birth NNNN, Instruments played");
            Scanner userChoice = new Scanner(System.in);
            String userTypeMusician = userChoice.next();
            Musician.add(userTypeMusician);
        }

// Add function to disallow empty character input
    public void addAlbum () {
        System.out.println("Add an Album in this format: Song name, artist name, album name, year of release NNNN");
        Scanner userChoice = new Scanner(System.in);
        String userTypeAlbum = userChoice.next();
        Album.add(userTypeAlbum);
        }

        //Show list of band first, then give user option to delete based on order in list
    public int removeBand () {
            for (BasicInfo dispBand : bands) {
                System.out.println(dispBand.getInfo());
            }
            System.out.println("Remove a band by typing the order of the band, top = 1");
            int userRemoveBand = userInt.nextInt();
            Band.remove((userRemoveBand) - 1);
        return userRemoveBand;
    }

        //Show list of Musician first, then give user option to delete based on order in list
    public int removeMusician () {
            for (BasicInfo dispMusician : Musician.musicianList) {
                System.out.println(dispMusician.getInfo());
            }
            int userRemoveMusician = userInt.nextInt();
            Musician.remove((userRemoveMusician) - 1);
        return userRemoveAlbum;
        }

        //Show list of Album first, then give user option to delete based on order in list
    public int removeAlbum () {
            for (Album dispAlbum : songs) {
                System.out.println(dispAlbum.getAlbum());
            }
            int userRemoveAlbum = userInt.nextInt();
            Musician.remove((userRemoveAlbum) - 1);

    }
}

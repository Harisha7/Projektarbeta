import java.util.*;

public class Main {
    public static void main(String[] args) {


    //testdata to test get
    BasicInfo.add("David", "rock", 0, 2000);
    BasicInfo.add("Steve", "EDM", 0, 1990);
    Musician.add("George", "New-age", 1980);
    Band.add("Jumping rocks", "EDM rap", 2005);
    Album alb1 = news Album("songName", "artistName", "albumName", songs, 1980  );

    userString = in.next();
    userInt = in.nextInt();
    public void mainMenu {
        System.out.println("\n".repeat(30)); //clear terminal
        System.out.println("Please choose an option 1-9" + "\n 1. Show Bands and Musicians" +
                "\n 2. Show Albums" + "\n 3. Add Musician" + "\n 4. Add Album" +
                "\n 5. Remove Bands" + "\n 6. Remove Musician" + "\n 7. Remove Album" + "\n 8. Quit");

        // 1-7 is for the basic functions required, display/add/delete. Ternary operator
        int menuChoice = in.nextInt();
        int userMenu = menuChoice == 1 ? showBand : menuChoice == 2 ? showAlbum : menuChoice == 3 ? addMusician :
            menuChoice == 4 ? addAlbum : menuChoice == 5 ? removeBand : menuChoice == 6 ? removeMusician :
                    menuChoice == 7 ? removeAlbum : "Bye";
    }

    public void showBand {
        for (BasicInfo dispBand : Band) {
            System.out.println(dispBand.getBand(name, info));
        }
        for (String dispMusician : Musician) {
            System.out.println(dispMusician.getMusician(name, info));
            System.out.println(current)
        }
            System.out.println("Return to main menu (1)");
        int userChoice = in.nextInt();
        if (userChoice == 1) {
        mainMenu;
        }
    }

    public void showAlbum {
        for (Album dispAlbum : songs) {
            System.out.println(dispAlbum.getAlbum());
        }
        System.out.println("Return to main menu (1)");
        int userChoice = in.nextInt();
        if userChoice == 1 {
                mainMenu;
            }
    }

    public void addMusician {
            String userTypeMusician = in.nextString();
            System.out.println("Add a musician in this format: Name, Info, Year of birth NNNN, Instruments played")
            Musician.add(userTypeMusician);
        }
// Add function to disallow empty character input
    public void addAlbum {
        String userTypeAlbum = in.next();
        System.out.println("Add an Album n in this format: Song name, artist nname, album name, year of release NNNN")
                Album.add(userTypeAlbum);
        }
}

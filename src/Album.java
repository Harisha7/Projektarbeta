import java.util.*;

public class Album extends Item{
    public String albumBand;
    public String albumName;
    public String albumInfo;
    public int year;
    public ArrayList<Title> songs;

    public Album(String albumName, String albumBand, String albumInfo, int yearOfRelease) {
        this.albumName = albumName;
        this.albumBand = albumBand; // name means here musician
        this.albumInfo = albumInfo;
        this.year = yearOfRelease;
        this.songs = new ArrayList<Title>();

    }
    class Title{
        public String albumName;

        public Title(String albumName, String title) {
            this.albumName = albumName;
            this.title = title;
        }

        public String title;
        public String getTitle(){
            return title;
        }

    }

    public String getArtist() {
        return albumBand;
    }

    public void setArtist(String artist) {
        this.albumBand = artist;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getTitle() {
        return albumName;
    }

    public void setName(String name) {
        name = name; // name means here musician
    }

    public String getName() {
        return albumName;
    }

    public void setAlbum(String albumName) {
        albumInfo = albumName;
    }

    public String getAlbum() {
        return albumInfo;
    }

    public void setyearOfRelease(int yearOfRelease) {
        year = yearOfRelease;
    }

    public int getYear() {
        return year;
    }

    public void showAlbumInfo(){
        System.out.println("The Album name is " + getName());
        System.out.println("The name of the Band that album is in " + getArtist());
        System.out.println("The Albums information is " + getAlbum());
        System.out.println("The year of release is "+ getYear());

    }


    // check if the song in any Album is exsits or not

    public Title findSong(String title) {

        for (Title checkedSong : songs) {
            if (checkedSong.getTitle().equals(title))
                return checkedSong;
        }
        return null;
    }

    public boolean addSong(String title, String albumName) {
        if (findSong(title) == null) {
            songs.add(new Title(title, albumName));
            System.out.println("song is added on the list");
            return true;
        } else {
            System.out.println("Song with name " + title + " already exist in the list");

            return false;
        }
    }
}
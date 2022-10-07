inport java.util.*;
public class Album {

    public String title; // songName or song title
    public String name; // musician
    public String albumName;
    public int year;
    public String infoText;
    public ArrayList<Title> songs;

    public Album(String title, String name, String albumName, int yearOfRelease , String infoText) {
        super(title, name);
        this.title = title;
        this.name = name; // name means here musician
        this.album = albumName;
        this.year = yearOfRelease;
        this.songs = new ArrayList<Title>();
        this.text = infoText;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        name = name; // name means here musician
    }

    public String getName() {
        return name;
    }

    public void setAlbum(String albumName) {
        album = albumName;
    }

    public String getAlbum() {
        return album;
    }

    public void setyearOfRelease(int year) {
        year = yearOfRelease;
    }

    public String getYear() {
        return year;
    }

    public String toString() {
        return "Title: " + getName() + ", Artist: " + getName()
                + ", Album: " + getAlbum() + ", Year of Release: " + getYear();
    }

    // check if the song in any Album is exsits or not

    public Song findSong(String title) {

        for (Song checkedSong : songs) {
            if (checkedSong.getTitle().equals(title))
                return checkedSong;
        }
        return null;
    }

    public boolean addSong(String title, String albumName) {
        if (findSong(title, albumName) == null) {
            songs.add(new Song(title, albumName));
            System.out.println("song is added on the list");
            return true;
        } else {
            System.out.println("Song with name " + title + " already exist in the list");

            return false;
        }
    }
}
import com.google.gson.annotations.JsonAdapter;
import java.util.*;

public class Album extends Item {
    public String albumBand;
    public String albumName;
    public String albumInfo;
    public int year;
    @JsonAdapter(ItemListAdapter.class)
    public ArrayList<Title> songs;

    public Album(String albumName, String albumBand, String albumInfo, int yearOfRelease) {
        this.albumName = albumName;
        this.albumBand = albumBand;
        this.albumInfo = albumInfo;
        this.year = yearOfRelease;
        this.songs = new ArrayList<Title>();
        ItemStore.add(this);

    }

    class Title {
        public String albumName;

        public Title(String albumName, String title) {
            this.albumName = albumName;
            this.title = title;
        }

        public String title;

    }

    public String getArtist() {
        return albumBand;
    }

    public String getName() {
        return albumName;
    }


    public String getAlbum() {
        return albumInfo;
    }

    public int getYear() {
        return year;
    }

    public void showAlbumInfo() {
        System.out.println("The Album name is " + getName());
        System.out.println("The name of the Band that album is in " + getArtist());
        System.out.println("The Albums information is " + getAlbum());
        System.out.println("The year of release is " + getYear());

    }

}
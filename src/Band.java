import com.google.gson.annotations.JsonAdapter;
import java.util.ArrayList;

public class Band extends Item {
    public String bandName;
    public String bandInfo;
    public int bandStartYear;
    public int bandEndYear;
    private int endYear;

    @JsonAdapter(ItemListAdapter.class)
    ArrayList<Musician> activeMembers = new ArrayList<>();
    @JsonAdapter(ItemListAdapter.class)
    ArrayList<Album> albums = new ArrayList<Album>();
    @JsonAdapter(ItemListAdapter.class)
    ArrayList<Musician> retiredMembers = new ArrayList<>();

    public Band(String bandName, String bandInfo, int bandStartYear, int bandEndYear) {
        this.bandName = bandName;
        this.bandInfo = bandInfo;
        this.bandStartYear = bandStartYear;
        this.bandEndYear = bandEndYear;
        ItemStore.add(this);
    }

    public void showBandInfo() {
        System.out.println("This band name is " + getBandName());
        System.out.println("This band has started " + getYear());
        if (getEndYear() != 0) {
            System.out.println("This band has retired " + getEndYear());
        }
        System.out.println("The band info is: " + getBandInfo());
        System.out.println("The active musicians are: ");
        showActiveMembers();
        System.out.println("The retired members are: ");
        showRetiredMembers();
        System.out.println("This band have released the following albums: ");
        showAlbums();
    }

    public void showActiveMembers() {
        for (Musician musician : activeMembers) {
            System.out.println(musician.getName());
        }
    }

    public void showRetiredMembers() {
        for (Musician musician : retiredMembers) {
            System.out.println(musician.getName());
        }
    }

    public String getBandName() {
        return bandName;
    }

    public int getYear() {
        return bandStartYear;
    }

    public String getBandInfo() {
        return bandInfo;
    }

    public int getEndYear() {
        return endYear;
    }

    public void showAlbums() {
        for (Album album : albums) {
            System.out.println(album.getName());
        }
    }

    public void addAlbumToBand(Album album) {
        if (!albums.contains(album)) {
            albums.add(album);
        }
    }

    public void addMusicianToBand(Musician musician) {
        if (0 > activeMembers.indexOf(musician)) {
            activeMembers.add(musician);
        }
    }

    public void removeMusicianFromBand(Musician musician) {
        if (0 <= activeMembers.indexOf(musician)) {
            activeMembers.remove(musician);
            retiredMembers.add(musician);
        }
    }

}

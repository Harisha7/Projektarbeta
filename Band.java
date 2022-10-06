package src;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Band extends BasicInfo {
    private int endYear;
    HashMap<Musician, String> membersAndJoinYear = new HashMap<Musician, String>();
    ArrayList<Album> albums = new ArrayList<Album>();
    ArrayList<String> infoAboutMembersQuit = new ArrayList<String>();

    public Band(String name, String info, int birthYear, int endYear) {
        super(name, info, birthYear);
        this.endYear = endYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public HashMap<Musician, String> getMembersAndJoinYear() {
        return membersAndJoinYear;
    }

    public void setMembersAndJoinYear(HashMap<Musician, String> membersAndJoinYear) {
        this.membersAndJoinYear = membersAndJoinYear;
    }
    //return list of albums
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public ArrayList<String> getInfoAboutMembersQuit() {
        return infoAboutMembersQuit;
    }

    public void setInfoAboutMembersQuit(ArrayList<String> infoAboutMembersQuit) {
        this.infoAboutMembersQuit = infoAboutMembersQuit;
    }
    public void addAlbumToBand(Album album ){
        if ( !albums.contains(album)) {
                albums.add(album);
            }
    }
    public void removeAlbumFromBand(Album album){
        for (Iterator<Album> it = albums.iterator(); it.hasNext(); ) {
            Album item = it.next();
            if (item == album ) {
                it.remove();
            }
        }
    }
    public void addMusicianToBand(Musician musician, String name ){
        if ( !membersAndJoinYear.containsKey(musician)) {
            membersAndJoinYear.put(musician, name);
        }
    }
    public void removeMusicianFromBand(Musician musician){
      if (membersAndJoinYear.containsKey(musician)){
          membersAndJoinYear.remove(musician);
      }
    }
}


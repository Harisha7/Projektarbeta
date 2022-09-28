import java.util.ArrayList;
import java.util.HashMap;

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
}

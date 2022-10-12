
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;;

public class Band extends BasicInfo {
    private int endYear;
   ArrayList<Musician> activeMembers = new ArrayList<>();
    ArrayList<Album> albums = new ArrayList<Album>();
    ArrayList<Musician> retiredMembers = new ArrayList<>();
    HashMap<Musician, String> activeMembersHashmap = new HashMap<>();
    HashMap<Musician, String> retiredMembersHashmap = new HashMap<>();


    public Band(String name, String info, int birthYear, int endYear) {
        super(name, info, birthYear, endYear);
        this.endYear = endYear;
    }
    public void showBandInfo(){
        System.out.println("This band name is "+ getName());
        System.out.println("This band has started " + getYear());
        if (getEndYear() !=0 ){
            System.out.println("This band has retired "+ getEndYear());

        }
        System.out.println("The band info is: "+ getInfo());
        System.out.println("The active musicians are: ");
        showActiveMembers();
        System.out.println("The retired members are: ");
        showRetiredMembers();
        System.out.println("This band has those albums: ");
        showAlbums();

    }

    public void showActiveMembers(){
        for (Musician musician : activeMembers){
            System.out.println(musician.getInfo());
        }
    }
    public void showRetiredMembers(){
        for (Musician musician : retiredMembers){
            System.out.println(musician.getInfo());
        }
    }

    public HashMap<Musician, String> getActiveMembersHashmap() {
        return activeMembersHashmap;
    }

    public void setActiveMembersHashmap(HashMap<Musician, String> activeMembersHashmap) {
        this.activeMembersHashmap = activeMembersHashmap;
    }

    public HashMap<Musician, String> getRetiredMembersHashmap() {
        return retiredMembersHashmap;
    }

    public void setRetiredMembersHashmap(HashMap<Musician, String> retiredMembersHashmap) {
        this.retiredMembersHashmap = retiredMembersHashmap;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public ArrayList<Musician> getActiveMembers() {
        return activeMembers;
    }

    public void setActiveMembers(ArrayList<Musician> activeMembers) {
        this.activeMembers = activeMembers;
    }
    public void showAlbums(){
        for (Album album : albums){
            System.out.println(album.toString());
        }
    }
    //return list of albums
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public ArrayList<Musician> getRetiredMembers() {
        return retiredMembers;
    }

    public void setRetiredMembers(ArrayList<Musician> retiredMembers) {
        this.retiredMembers = retiredMembers;
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
    public void addMusicianToBand(Musician musician ){
        if ( 0 > activeMembers.indexOf(musician)) {
            activeMembers.add(musician);
        }
    }
    public void removeMusicianFromBand(Musician musician){
      if (0 <= activeMembers.indexOf(musician)){
          activeMembers.remove(musician);
          retiredMembers.add(musician);
      }
    }
    public List<Musician> getActiveMusicians(){
        return activeMembers;

    }
    public List<Musician> getRetiredMusicians(){
        return retiredMembers;

    }
}



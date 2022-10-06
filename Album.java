public class Album {

    public String title; // songName or song title
    public String artist;
    public String album;
    public int year;
    public ArryList<Title> songs;

    public Album(String songName, String artistName, String albumName , ArryList<Title> , int yearOfRelease) {
        this.name = title;
        this.artist = artistName;
        this.album = albumName;
        this.title = new ArryList<Title>();
        this.year = yearOfRelease;
    }
    public void setName(String title) {
        name = title;
    }
    public String getName() {
        return name;
    }
    public void setArtist(String artistName) {
        artist = artistName;
    }
    public String getArtist() {
        return artist;
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
        return "Title: " + getName() + ", Artist: " + getArtist()
                + ", Album: " + getAlbum() + ", Year of Release: " + getYear();
    }


    // check if the song in any Album is exsits or not

    public Song findSong(String title){

        for(Song checkedSong : songs){
            if(checkedSong.getTitle().equals(title)) return checkedSong;
        }
        return null;
    }
    public boolean addSong(String title, String albumName) {
        if (findSong(title, albumName) == null) {
            songs.add(new Song(title, albumName));
            System.out.println("song is added on the list");
            return true;
        } else {
             System.out.println("Song with name "+ title + " already exist in the list");

            return false;
        }
    }
}
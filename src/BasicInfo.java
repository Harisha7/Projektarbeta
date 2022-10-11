import java.util.*;

public class BasicInfo {
    private String name;
    private String genres;
    private int numberOfMembers;
    private int year;


    public BasicInfo(String name, String genres, int numberOfMembers, int year) {
        this.name = name;
        this.genres = genres;
        this.numberOfMembers = numberOfMembers;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getInfo(){
        return name  + " type of music "+ genres +" this band started" + year +
                " has"+ getNumberOfMembers()+ " members";
    }




}

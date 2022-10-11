import java.util.*;

public class BasicInfo {
    private String name;
    private String genre;

    private int NumberOfMembers;
    private int year;

 


    public BasicInfo(String name, String genres, int numberOfMembers, int year) {
        this.name = name;
        this.genre = genres;
        this.NumberOfMembers = numberOfMembers;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenres() {
        return genre;
    }

    public void setGenres(String genres) {
        this.genre = genres;
    }

    public int getNumberOfMembers() {
        return NumberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        NumberOfMembers = numberOfMembers;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        year = year;
    }



    public String getInfo(){
        return name + "type of music" +genre + "this band started" +year +
                "has"+ getNumberOfMembers()+"members";
    }




}

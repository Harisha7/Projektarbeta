import java.util.*;

public class BasicInfo {
    private String name;
    private String info;
    private int numberOfMembers;
    private int year;


    public BasicInfo(String name, String info, int numberOfMembers, int year) {
        this.name = name;
        this.info = info;
        this.numberOfMembers = numberOfMembers;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
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
        return name  + "this band started" + year +
                "has"+ getNumberOfMembers()+ "members";
    }




}

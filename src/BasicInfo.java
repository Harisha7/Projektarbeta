public class BasicInfo {
    private String name;
    private String genres;
    private int numberOfMembers;
    private int EstablishYear;


    public BasicInfo(String name, String genres, int numberOfMembers, int establishYear) {
        this.name = name;
        this.genres = genres;
        this.NumberOfMembers = numberOfMembers;
        this.EstablishYear = establishYear;
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
        return NumberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        NumberOfMembers = numberOfMembers;
    }

    public int getEstablishYear() {
        return EstablishYear;
    }

    public void setEstablishYear(int establishYear) {
        EstablishYear = establishYear;
    }

}

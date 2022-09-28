public class Musician {
    public String name;
    public String infoText;
    public int yearOfBirth;

    public Musician(String name, String infoText, int yearOfBirth){
        this.name = name;
        this.infoText = infoText;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName(){

        return name;
    }

    public String getInfoText(){

        return infoText;
    }
    public int getYearOfBirth(){

        return yearOfBirth;
    }
}

package JavaForBeginner.Lesson_33_Constructor;

public class Constructor {

    private String StreetNameAndHouseNumber;
    private String CityName;

    public String getStreetNameAndHouseNumber() {
        return StreetNameAndHouseNumber;
    }

    public void setStreetNameAndHouseNumber(String streetNameAndHouseNumber) {
        StreetNameAndHouseNumber = streetNameAndHouseNumber;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public Constructor(String streetNameAndHouseNumber, String cityName) {
        StreetNameAndHouseNumber = streetNameAndHouseNumber;
        CityName = cityName;
    }
}




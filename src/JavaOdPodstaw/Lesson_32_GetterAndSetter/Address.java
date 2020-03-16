package JavaOdPodstaw.Lesson_32_GetterAndSetter;

public class Address {


    private String StreetNameAndHouseNumber;
    private String CityName;
    private String postCode;

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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}

package JavaForBeginner.Practice_06_Invoice;

public class CompanyAddress {

    private String streetAndNumber;
    private String cityName;
    private String postCode;

    public CompanyAddress() {

    }


    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public CompanyAddress(String streetAndNumber, String cityName, String postCode) {
        this.streetAndNumber = streetAndNumber;
        this.cityName = cityName;
        this.postCode = postCode;
    }



}

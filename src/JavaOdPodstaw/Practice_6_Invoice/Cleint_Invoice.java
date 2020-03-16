package JavaOdPodstaw.Practice_6_Invoice;

public class Cleint_Invoice {

    private String companyName;
    private CompanyAddress companyAddress;
    private String NIP;

    public Cleint_Invoice() {

    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CompanyAddress getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(CompanyAddress companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public Cleint_Invoice(String companyName, CompanyAddress companyAddress, String NIP) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.NIP = NIP;
    }
}

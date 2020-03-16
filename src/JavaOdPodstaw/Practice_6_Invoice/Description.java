package JavaOdPodstaw.Practice_6_Invoice;

public class Description {

    private String name;
    private int quantity;
    private double netValue;
    private double VAT;
    private double grossValue;
    private double netValueTotal;
    private double VATTotal;
    private double grossValueTotal;

    public double getVATTotal() {
        VATTotal = netValueTotal*VAT;
        return VATTotal;
    }

    public void setVATTotal(double VATTotal) {
        this.VATTotal = VATTotal;
    }

    public double getGrossValueTotal() {
        grossValueTotal = netValueTotal*(VAT+1);
        return grossValueTotal;
    }

    public void setGrossValueTotal(double grossValueTotal) {
        this.grossValueTotal = grossValueTotal;
    }

    public double getNetValueTotal() {
        netValueTotal = netValue*quantity;
        return netValueTotal;
    }

    public void setNetValueTotal(double netValueTotal) {
        this.netValueTotal = netValueTotal;
    }

    public Description() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getNetValue() {
        netValue = netValue*quantity;
        return netValue;
    }

    public void setNetValue(double netValue) {
        this.netValue = netValue;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public double getGrossValue() {
        grossValue = netValue*(VAT+1);
        return grossValue;
    }

    public void setGrossValue(double grossValue) {
        this.grossValue = grossValue;
    }

    public Description(String name, int quantity, double netValue, double VAT, double grossValue) {
        this.name = name;
        this.quantity = quantity;
        this.netValue = netValue;
        this.VAT = VAT;
        this.grossValue = grossValue;
    }


}



import java.util.Date;

public class Order {

    private Date issuanceDate;
    private Date endDate;
    private double price;
    private SalesEmployee responsible;

    public Order(Date issuanceDate, Date endDate, double price, SalesEmployee responsible) {
        this.issuanceDate = issuanceDate;
        this.endDate = endDate;
        this.price = price;
        this.responsible = responsible;
    }

    public Date getIssuanceDate() {
        return issuanceDate;
    }

    public void setIssuanceDate(Date issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SalesEmployee getResponsible() {
        return responsible;
    }

    public void setResponsible(SalesEmployee responsible) {
        this.responsible = responsible;
    }

}

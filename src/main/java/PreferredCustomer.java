
public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private int discountLevel;

    public PreferredCustomer(String name, String address, String number, String customerNum, boolean mailingList, int loyaltyPoints, int discountLevel) {
        super(name, address, number, customerNum, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    public PreferredCustomer() {

        super();
        discountLevel = 0;
        loyaltyPoints = 0;
    }
}
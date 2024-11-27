
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

    @Override
    public String toString() {
        return super.toString() + "PreferredCustomer{" +
                "loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '%';
    }

    public void addLoyaltyPoints(int i) {
        loyaltyPoints += i;
    }

    public void setDiscountLevel() {

        if (loyaltyPoints >= 500) {
            discountLevel = 5;
        }
        if (loyaltyPoints >= 1000) {
            discountLevel = 6;
        }
        if (loyaltyPoints >= 1500) {
            discountLevel = 7;
        }
        if (loyaltyPoints >= 2000) {
            discountLevel = 10;
        }
    }
}
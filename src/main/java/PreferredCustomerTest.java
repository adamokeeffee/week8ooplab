public class PreferredCustomerTest {
    public static void main(String[] args) {

        PreferredCustomer preferredCustomer2 = new PreferredCustomer();
        preferredCustomer2.setName("Subhan");
        preferredCustomer2.setAddress("Ballyhaunis");
        preferredCustomer2.setNumber("085 734579");
        preferredCustomer2.setCustomerNum("1002");
        preferredCustomer2.setMailingList(false);
        preferredCustomer2.addLoyaltyPoints(1000);// Accumulate points
        preferredCustomer2.setDiscountLevel();
        System.out.println(preferredCustomer2);
        preferredCustomer2.addLoyaltyPoints(1000); // Accumulate more points
        preferredCustomer2.setDiscountLevel();
        System.out.println(preferredCustomer2);
    }
}

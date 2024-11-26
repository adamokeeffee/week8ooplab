public class Customer extends Person {
    private String customerNum;
    private boolean mailingList;

    public Customer(String name, String address, String number, String customerNum, boolean mailingList) {
        super(name, address, number);
        this.customerNum = customerNum;
        this.mailingList = mailingList;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + "Customer{customerNum='" + this.customerNum + "', mailingList=" + this.mailingList + "}";
    }

    public String getCustomerNum() {
        return this.customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public boolean isMailingList() {
        return this.mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    public Customer() {
        this.customerNum = " ";
        this.mailingList = false;
    }
}


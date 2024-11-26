public class Person {
    private String name;
    private String address;
    private String number;

    public Person(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public Person() {
        this.name = " ";
        this.address = " ";
        this.number = " ";
    }

    public String toString() {
        return "Person{name='" + this.name + "', address='" + this.address + "', number=" + this.number + "}";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

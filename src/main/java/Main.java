public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Customer part1customer = new Customer("Tom", "Ballyhaunis", "08764444", "1000000", true);
        System.out.println(part1customer);
        Customer part2customer = new Customer();
        part2customer.setName("John");
        part2customer.setAddress("Ballinrobe");
        part2customer.setNumber("08538388");
        part2customer.setCustomerNum("2000000");
        part2customer.setMailingList(true);

        System.out.println("part 2 customers details:");
        System.out.println("name :" + part2customer.getName());
        System.out.println("address :" + part2customer.getAddress());
        System.out.println("number :" + part2customer.getNumber());
        System.out.println("customerNum :" + part2customer.getCustomerNum());
        System.out.println("mailingList :" + part2customer.isMailingList());
    }
}


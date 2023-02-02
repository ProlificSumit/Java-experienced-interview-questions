package com.learn.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {
    private final String name;
    private final Date joiningDate;
    private final List<String> mobiles;
    private final Address address;

    public Employee(String name, Date joiningDate, List<String> mobiles, Address address) {
        this.name = name;
        this.joiningDate = joiningDate;
        this.mobiles = mobiles;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Date getJoiningDate() {
        Date date = (Date) joiningDate.clone();
        return date;
    }

    public List<String> getMobiles() {
        return new ArrayList<>(mobiles);
    }

    public Address getAddress() {
        return new Address(address.getCity(),address.getZipCode());
    }

    @Override
    public String toString() {
        return "ImmutableEmployee{" +
                "name='" + name + '\'' +
                ", joiningDate=" + joiningDate +
                ", mobiles=" + mobiles +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        List<String> mobiles = new ArrayList<>();
        mobiles.add("1234");
        mobiles.add("5678");

        Address address = new Address("Hyd", "500081");
        Employee emp1 = new Employee("Sumit", new Date(), mobiles, address);
        emp1.getJoiningDate().setDate(25);
        System.out.println(emp1);

        // try to modify list

        emp1.getMobiles().add("9010");
        System.out.println(emp1);

        // try to modify address which is mutable object

        emp1.getAddress().setCity("BLR");
        System.out.println(emp1);
    }
}

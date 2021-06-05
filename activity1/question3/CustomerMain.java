package com.ltts;

import java.util.*;

public class CustomerMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details");
        String s = sc.next();
        String[] str = s.split(",");
        String name = str[0];
        String address = str[1];
        String mobile = str[2];
        Customer c = new Customer(name, address, mobile);
        System.out.print("Name: " + c.getName() + "\nAddress: " + c.getAddress() + "\nMobile: " + c.getMobile());
    }
}

class Customer {
    private String name;
    private String address;
    private String mobile;

    Customer(String name, String address, String mobile) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    String getMobile() {
        return mobile;
    }
}
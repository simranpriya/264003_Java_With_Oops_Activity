package com.ltts;

import java.util.*;

public class EmployeeMain 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        System.out.println("Enter the name:");
        String name = sc.next();
        System.out.println("Enter Address:");
        String address = sc.next();
        System.out.println("Enter Mobile:");
        String mobile = sc.next();
        
        try {
            double value = Double.parseDouble(mobile);
            if(value<0)
               System.out.println("Invalid Input");
            else
               System.out.println(value + " is positive");

        } catch (NumberFormatException x) {
            System.out.println("String "+ mobile + "is not a number");
        }

        e.setName(name);
        e.setAddress(address);
        e.setMobile(mobile);
        System.out.println("\nEmployee Details\nName: " + e.getName() + "\nAddress: " + e.getAddress() + "\nMobile: "
                + e.getMobile());
    }
}

class Employee 
{
    private String name;
    private String address;
    private String mobile;

    public String getName() 
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }
}
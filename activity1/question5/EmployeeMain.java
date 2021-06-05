package com.ltts;

import java.util.Scanner;

class Employee {
	private String name;
	private String address;
	private String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}

class EmployeeMain {
	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the name:");
		String name = sc.next();
		e.setName(name);
		
		System.out.println("Enter Address:");
		String address = sc.next();
		e.setAddress(address);
		
		System.out.println("Enter Mobile:");
		String number = sc.next();
		e.setMobile(number);
		
		System.out.println("The details are:");
		System.out.println("Name :"+e.getName());
		System.out.println("Address :"+e.getAddress());
		System.out.println("Mobile :"+e.getMobile());
		System.out.println("Verify and Update the details:");
		
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1. Update Employee name");
			System.out.println("2. Update Employee Address");
			System.out.println("3. Update Employee mobile");
			System.out.println("4. All information correct/Exit");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Current employee name is:"+e.getName());
					System.out.println("Enter the employee name :");
					name = sc.next();
					e.setName(name);
					break;
			
			case 2: System.out.println("Current Address is :"+e.getAddress());
					System.out.println("Enter the Address :");
					address = sc.next();
					e.setAddress(address);
					break;
			
			case 3: System.out.println("Current Mobile number is :"+e.getMobile());
					System.out.println("Enter the Mobile number :");
					number = sc.next();
					e.setMobile(number);
					break;
			
			case 4: System.out.println("The details are:");
					System.out.println("Name :"+e.getName());
					System.out.println("Address :"+e.getAddress());
					System.out.println("Mobile :"+e.getMobile());
					return;
			
			default: System.out.println("Invalid choice");							
			}	
		}		
	}
}
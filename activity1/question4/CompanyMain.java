package com.ltts;

import java.util.Scanner;

class Company
{
	private String name;
	private String employees;
	private String teamlead;
    public void setName(String name)
    {
		this.name = name;
	}
    public String getName()
    {
		return name;
	}
    public void setEmployess(String employees)
    {
		this.employees = employees;
	}
	public String[] getEmployees(){
		return employees.split(",");
	}
    public void setTeamLead(String teamlead)
    {

		this.teamlead = teamlead;
	}
	public String getTeamLead(){
		return teamlead;
    }
    

    public void printDetails()
    {
        int flag = 0;
        //int n=list.length;
		String[] list = employees.split(",");
		for(int i = 0; i < list.length; i++){
            if (teamlead.equals(list[i]))
            {
				flag = 1;
				break;
			}
		}
		if (flag == 1){
			System.out.println("\nName: "+name);
			System.out.println("Employees: "+employees);
			System.out.println("Lead: "+teamlead);
		} else {
			System.out.println("Invalid Input");
		}
	}
}

public class CompanyMain 
{

    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the company name: ");
		String name = sc.nextLine();
		System.out.println("Enter the employees: ");
		String employees = sc.next();
		System.out.println("Enter Team Lead: ");
		String teamlead = sc.next();
		
		Company c = new Company();
		c.setEmployess(employees);
		c.setName(name);
		c.setTeamLead(teamlead);
		c.printDetails();
		

    }
    
}    

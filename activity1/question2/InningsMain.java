package com.ltts;

import java.util.Scanner;
class Innings{
	private String teamname;
	private String inningsname;
	private int runs;
	
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	
	public String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}
	
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public void displayInningsDetails() {
		if(inningsname.equalsIgnoreCase("First"))
		{
			System.out.println("Name:"+teamname+"\nScored:"+runs+"\nNeed "+(runs+1)+" to win");
		}
		else
		{
			System.out.println("Name:"+teamname+"\nScored:"+runs+"\nMatch ended");
		}	
	}	
}

public class InningsMain {
	public static void main(String[] args) {
		Innings i = new Innings();
		System.out.println("Enter the team name:");
		Scanner sc = new Scanner(System.in);
		i.setTeamname(sc.next());
		
		System.out.println("Enter session:");
		i.setInningsname(sc.next());
		
		System.out.println("Enter runs:");
		i.setRuns(sc.nextInt());
		
		i.displayInningsDetails();
	}

}
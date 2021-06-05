//package com.ltts;

import java.util.Scanner;

class Vehicle {
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected Integer fuelCapacity;
	protected Integer cc;
	public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc) {
		this.make=make;
		this.vehicleNumber=vehicleNumber;
		this.fuelType=fuelType;
		this.fuelCapacity=fuelCapacity;
		this.cc=cc;
	}
        public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public Integer getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(Integer fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public Integer getCc() {
		return cc;
	}
	public void setCc(Integer cc) {
		this.cc = cc;
	}
	
	public void displayMake() {
		 System.out.println("***"+make+"***");
	}
	public void displayBasicInfo() {
		 System.out.println("--Basic Information--");
                 System.out.println("Vehicle Number: "+vehicleNumber+"\nFuel Capacity: "+fuelCapacity);
                 if(fuelType.equals("1")) {
        	        System.out.println("Fuel Type: Petrol");
                 }
                 else {
        	       System.out.println("Fuel Type: Diesel");
                 }
                 System.out.println("CC: "+cc);
	}
	public void displayDetailInfo() {
	}
	
}
class TwoWheeler extends Vehicle{
	private Boolean kickStartAvailable;
	
	public Boolean getKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(Boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	TwoWheeler(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc,String kick){
		super(make,vehicleNumber,fuelType,fuelCapacity,cc);
		if(kick.equalsIgnoreCase("yes")){
			kickStartAvailable=true;
		}
		else {
			kickStartAvailable=false;
		}
	}
	
	public void displayDetailInfo() {
		if(kickStartAvailable) {
		      System.out.println("Kick Start Available: YES");
		} 
		else {
			System.out.println("Kick Start Available: NO");
		}
	}
}
class FourWheeler extends Vehicle{
	private String audioSystem;
	private Integer noOfDoors;
	
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public Integer getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(Integer noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	public FourWheeler(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc,String audioSystem,Integer noOfDoors) {
		super(make,vehicleNumber,fuelType,fuelCapacity,cc);
		this.audioSystem=audioSystem;
		this.noOfDoors=noOfDoors;
	}
	public void displayDetailInfo() {
		System.out.println("--Detail Information--");
		System.out.println("Audio System: "+audioSystem+"\nNumber of Doors: "+noOfDoors);
	}
}


public class VehicleMain {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type");
		Integer vehicleType = input.nextInt();
		System.out.println("Vehicle Make: ");
                String make=input.next();
		System.out.println("Vehicle Number: ");
		String vehicleNumber=input.next();
		System.out.println("Fuel Type: \n1.Petrol\n2.Diesel");
		String fuelType=input.next();
		System.out.println("Fuel Capacity: ");
		Integer fuelCapacity=input.nextInt();
		System.out.println("Engine CC: ");
		Integer cc=input.nextInt();
		if(vehicleType==1){ 
	              System.out.println("Audio System: ");
		      String audioSystem=input.next();
		      System.out.println("No of Doors: ");
		      int noOfDoors= input.nextInt();
		      FourWheeler f=new FourWheeler(make,vehicleNumber,fuelType,fuelCapacity,cc,audioSystem,noOfDoors);
		      f.displayMake();
		      f.displayBasicInfo();
		      f.displayDetailInfo(); 
		}
		else{
		      System.out.println("Kick Start Available(yes/no): ");
		      String kickStartAvailability=input.next();
		      TwoWheeler t=new TwoWheeler(make,vehicleNumber,fuelType,fuelCapacity,cc,kickStartAvailability);
		      t.displayMake();
		      t.displayBasicInfo();
		      t.displayDetailInfo();
		}
	}
}
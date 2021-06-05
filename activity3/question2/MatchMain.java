package com.ltts;

import java.util.Scanner;

abstract class Match{
	private int currentScore;
	private float currentOver;
	private int target;
	
	public void setCurrentScore(int currentScore){
		this.currentScore = currentScore;
	}
	
	public int getCurrentScore(){
		return currentScore;
	}
	
	public void setCurrentOver(float currentOver){
		this.currentOver = currentOver;
	}
	
	public float getCurrentOver(){
		return currentOver;
	}
	
	public void setTarget(int target){
		this.target = target;
	}
	
	public int getTarget(){
		return target;
	}
	
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(float reqRunRate, int balls);
}

class ODIMatch extends Match{
	private int overs = 50;
	private int balls;
	private float reqRunRate;
	public int calculateBalls(){
		balls = (int)(50 - getCurrentOver());
		return balls*6;
	}
	public float calculateRunRate(){
		reqRunRate = (getCurrentScore() / getCurrentOver());
		return reqRunRate;
		
	}
	
	public void display(float reqRunRate, int balls){
		int runs = getTarget() - getCurrentScore();
		System.out.println("Need " + runs + " runs in " + balls + " balls");
		System.out.println("Required RunRate: " + reqRunRate);
	}

}

class TestMatch extends Match{
	private int overs = 90;
	private int balls;
	private float reqRunRate;
	public int calculateBalls(){
		balls = (int)(90 - getCurrentOver());
		return balls*6;
	}
	public float calculateRunRate(){
		reqRunRate = (getCurrentScore() / getCurrentOver());
		return reqRunRate;
	}
	
	public void display(float reqRunRate, int balls){
		int runs = getTarget() - getCurrentScore();
		System.out.println("Need " + runs + " runs in " + balls + " balls.");
		System.out.println("Required RunRate: " + reqRunRate);
	}
}

class T20 extends Match{
	private int overs = 20;
	private int balls;
	private float reqRunRate;
	public int calculateBalls(){
		balls = (int)(20 - getCurrentOver());
		return balls*6;
	}
	
	public float calculateRunRate(){
		reqRunRate = (getCurrentScore() / getCurrentOver());
		return reqRunRate;
	}
	
	public void display(float reqRunRate, int balls){
		int runs = getTarget() - getCurrentScore();
		System.out.println("Need " + runs + " runs in " + balls + " balls");
		System.out.println("Required RunRate: " + reqRunRate);
	}
}

public class MatchMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter the match format: ");
		System.out.println("1. ODI");
		System.out.println("2. T20");
		System.out.println("3. Test");
		int currentScore, targetScore, balls;
		float currentOver, runRate;
		choice = sc.nextInt();
		System.out.println("Enter the current Score: ");
		currentScore = sc.nextInt();
		System.out.println("Enter the current Over: ");
		currentOver = sc.nextInt();
		System.out.println("Enter the target Score: ");
		targetScore = sc.nextInt();
		switch(choice){
		case 1:
			ODIMatch om = new ODIMatch();
			om.setCurrentOver(currentOver);
			om.setCurrentScore(currentScore);
			om.setTarget(targetScore);
			balls = om.calculateBalls();
			runRate = om.calculateRunRate();
			System.out.println("Requirements: ");
			om.display(runRate, balls);
			break;
		case 3:
			TestMatch tm = new TestMatch();
			tm.setCurrentOver(currentOver);
			tm.setCurrentScore(currentScore);
			tm.setTarget(targetScore);
			balls = tm.calculateBalls();
			runRate = tm.calculateRunRate();
			System.out.println("Requirements: ");
			tm.display(runRate, balls);
			break;
		case 2:
			T20 t20 = new T20();
			t20.setCurrentOver(currentOver);
			t20.setCurrentScore(currentScore);
			t20.setTarget(targetScore);
			balls = t20.calculateBalls();
			runRate = t20.calculateRunRate();
			System.out.println("Requirements: ");
			t20.display(runRate, balls);
			break;
		default:
			break;
		}

	}

}

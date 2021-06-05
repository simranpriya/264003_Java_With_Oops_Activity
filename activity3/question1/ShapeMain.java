package com.ltts;

import java.util.Scanner;
import java.text.DecimalFormat;

import java.util.Formatter;

abstract class Shape
{
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	abstract double calculateArea(int value);
}

class Circle extends Shape
{
	double calculateArea(int value)
	{
		return (double) (3.14*value*value);
	}
}

class Square extends Shape
{
	double calculateArea(int value)
	{
		return value*value;
	}
}

public class ShapeMain {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Circle \nSquare");
		System.out.println("Enter the shape");
		String type = sc.next();
		Shape s;
		if(type.equalsIgnoreCase("Circle"))
		{
			System.out.println("Enter the radius");
			int radius = sc.nextInt();
			s=new Circle();
			System.out.println("Area of Circle:"+s.calculateArea(radius));
		}
		else
		{
			System.out.println("Enter the side");
			int side = sc.nextInt();
			s=new Square();
			System.out.println("Area of Circle:"+s.calculateArea(side));
		}
	}
}

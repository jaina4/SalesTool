package com.test;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		displayGreeting();
		data.display();

	}
	
	private static void displayGreeting()
	{
		System.out.println("Hello There");
		System.out.println("This app shows sales data");
		System.out.println("Test 1");
		System.out.println("Test 2");
	}

}

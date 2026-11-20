package com.javaintro;

public class Test7 {

	{
		System.out.println("instance block");
	}

	public static void main(String[] args) {
		
		{
			System.out.println("block inside main method");
		}

	}

}

package com.arrays1D;
import java.util.Scanner;

//WAP to find min and max element of an array using for each loop?
public class MinMax1 {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
//		System.out.println("enter elements into the array : ");
//		for (int i:arr) {
//			i = sc.nextInt();
//		}
		
		
//   Rule to remember:
//		✅ Use a for loop to accept/update array elements.
//		✅ Use a for-each loop to read/display/process array elements.
//		❌ Do not use a for-each loop to store values into an array.
		
		System.out.println("enter elements into the array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("elements of the array : ");
		for (int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		int min=arr[0];
		int max=arr[0];
		for (int i:arr) {
			
			if(i<min)
			{
				min=i;
			}
			else if(i>max)
			{
				max=i;
			}
		}
		System.out.println("min element of the array is : "+min);
		System.out.println("max element of the array is : "+max);


		
	}

}

package com.onebill.corejava.assignments.day4;

import java.util.Scanner;

public class SmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter number of elements: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Array Input");
		for(int i=0;i<n;i++) {
			System.out.print("Enter Element Number "+ (i+1)+ " : ");
			arr[i]=s.nextInt();
		}
		for(int i:arr)
			System.out.print(i+ " ");
		System.out.println("\nArray Sorting");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int tmp=0;
				if(arr[i]>arr[j]) {
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.print("Second Largest is "+(arr[arr.length-2])+"\nSecond Smallest is "+(arr[1]));

	}

}

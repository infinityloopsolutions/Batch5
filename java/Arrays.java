package com.example;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[];
		System.out.println("enter the size of the array...");
		int size = sc.nextInt();
		arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter " + i + " element..");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		sc.close();

	}

}

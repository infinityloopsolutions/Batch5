package com.example;
import java.util.ArrayList;

public class StringMethods {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("James");
		names.add("Johnes");
		names.add("Zeus");
		names.add("Jerry");
		names.add("Ben");
		names.add("Felix");
		names.add("Rames");
		names.add("Sures");
		ArrayList<String> result = new ArrayList<String>();
		for(String name:names) {
			if(name.endsWith("es")) {
				result.add(name);
			}
		}
		
		/*
		 * for(String data: result) { System.out.println(data);
		 * 
		 * }
		 */
		String a = "100";
		int b = Integer.parseInt(a);
		int x  = 10;
		String z = String.valueOf(x);
		System.out.println(b+z);
		
		String input = "Naveen123";
		char arr[] = input.toCharArray();
		for(char a1 : arr) {
			System.out.println(a1);
		}
		
		
		
		
		

	}

}

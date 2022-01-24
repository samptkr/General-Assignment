package com.java.demo.assignments;

public class ReverseStringWords {

	public static void main(String[] args) {
//		String input = "how are you";
		String input = "On The Table";
		input = input.trim().replaceAll("\\s", " ");
		String arr[] = input.split(" ");
		
		String output = "";
		for(String word : arr) {
			StringBuilder builder = new StringBuilder(word);
			output = output+builder.reverse().toString()+" ";
		}
		
		System.out.println(output);
	}

}

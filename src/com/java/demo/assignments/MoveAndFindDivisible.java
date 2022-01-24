package com.java.demo.assignments;

import java.util.Arrays;

public class MoveAndFindDivisible {

	public static void main(String[] args) {
		int input[] = {10,77,92,1,30,81,1,4,1,20,17,1,16,33};
		int divisibleIp = 10;
		int j = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 1) {
				int temp = input[j];
				input[j] = input[i];
				input[i] = temp;
				j++;
			}
		}	 
		System.out.println("Shift element Result: " + Arrays.toString(input));
		
		for (int i =0 ; i<input.length; i++) {
			if(input[i]%divisibleIp==0) {
				System.out.println("Index "+i +" and Value "+input[i]);
			}
		}
	}
}

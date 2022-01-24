package com.java.demo.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FindNumericAndItsIndex {

	public static void main(String[] args) {
		
		List<String> arrList = Arrays.asList("123.1","test","0","0.0","0.0.","data","hi","287653.999999","ok","*","&amp;","2.22.2");
		
		Map<Integer, String> indexedNumbers = new TreeMap<Integer, String>(Collections.reverseOrder());
		int i = 0;
		ListIterator<String> it = arrList.listIterator();
		while(it.hasNext()) {
			String str = it.next();
			if(str.matches("[+-]?\\d*(\\.\\d+)?")) {
				indexedNumbers.put(i, str);
			}
			i++;
		}
		
		for (Map.Entry<Integer,String> entry : indexedNumbers.entrySet()) {
			System.out.println("Index = " + entry.getKey() + " and number = " + entry.getValue());   
		}   
	}
}

package io.megha.codingQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * This program searches for duplicate characters in a String
 * @author meghaz
 *
 */
public class DuplicateCharacterSearch {


	public static void main(String[] args) {
		String inputString="axaaAbs";
		System.out.println("inputString: " + inputString);
		System.out.println("Duplicate Characters Present in the String: "+ duplicatesPresent(inputString));
		System.out.println("Complete list of duplicates: ");
		fullListOfDuplicates(inputString);
	}
	private static void fullListOfDuplicates(String inputString) {
		if(null!=inputString) {
		Map<String, Integer> duplicateSotter = new HashMap<String, Integer>();
		for(int i=0; i<inputString.length();i++) {
			Integer count = duplicateSotter.containsKey(String.valueOf(inputString.charAt(i)))? duplicateSotter.
					get(String.valueOf(inputString.charAt(i))):0;
			duplicateSotter.put(String.valueOf(inputString.charAt(i)), count+1);
			
		}
			duplicateSotter.forEach((x,y)->System.out.println("Character: "+x+" Count: "+y));
		}
	}
	
	private static boolean duplicatesPresent(String inputString) {
		if(null!= inputString) {
		// Sorting to improve the efficiency
		inputString = sortString(inputString);
		Map<String, Integer> duplicateChecker = new HashMap<String, Integer>();
		for(int i=0; i<inputString.length();i++) {
			if(duplicateChecker.containsKey(String.valueOf(inputString.charAt(i)))) {
				return true;
			}
			else {
				duplicateChecker.put(String.valueOf(inputString.charAt(i)), 1);
			}
			
		}
		}
		return false;
	}
	private static String sortString(String inputString) {
		char tempSorted[] = inputString.toCharArray();
		Arrays.sort(tempSorted);
		inputString=String.valueOf(tempSorted);
		System.out.println("Sorted Input: "+ inputString);
		return inputString;
	}


}

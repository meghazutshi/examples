package io.megha.codingQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 * This program searches for duplicate characters in a String
 * @author meghaz
 *
 */
public class DuplicateCharacterSearch {

	public static void main(String[] args) {
		String inputString="abaabaxaz";
		System.out.println("inputString: " + inputString);
		Map<String, Integer> duplicateSotter = new HashMap<String, Integer>();
		for(int i=0; i<inputString.length();i++) {
			Integer count = duplicateSotter.get(String.valueOf(inputString.charAt(i)));
			if(null!=count) {
				duplicateSotter.put(String.valueOf(inputString.charAt(i)), count+1);
			}
			else {
				duplicateSotter.put(String.valueOf(inputString.charAt(i)), 1);
			}
			
		}
		duplicateSotter.forEach((x,y)->System.out.println("Character: "+x+" Count: "+y));
	}

}

package io.chags.deco;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterSearch {

	public static void main(String[] args) {
		String input ="baxa";
		String duplicateString="";
		System.out.println("Inpout String"+ input);
		System.out.println("String to be found"+duplicateString);
		System.out.println("Re-occurring String Details"+ duplicateSearch(input, duplicateString));
		System.out.println("Re-occurring String Details"+ checkDuplicateCharactersSingleLoop(input));
		//System.out.println("substring "+input.substring(1, 4));

	}

	private static boolean duplicateSearch(String input, String duplicateString) {
		
		if(input.length() > 0 && duplicateString.length() >0) {
			return ifCharToBeSearchedPresent(input, duplicateString);
		}
		else if(input.length() > 0) {
			return checkDuplicateCharacters(input);
		}
		return false;
	}

	private static boolean checkDuplicateCharacters(String input) {
		int countNew=1;
		int order =0;
		Map<String,Integer> duplicates = new HashMap<String,Integer>();
		for(int i=0;i<input.length();i++) {
			if(!(duplicates.get(String.valueOf(input.charAt(i)))!=null)) {
				for(int j=i+1;j<input.length();j++) {
					if(String.valueOf(input.charAt(i)).equals(String.valueOf(input.charAt(j)))) {
						duplicates.put(String.valueOf(input.charAt(i)), ++countNew);
					}
					order=order+1;
				}
			}
			countNew=1;
		}
		System.out.println("Input Size"+input.length());
		System.out.println("Duplicates"+duplicates);
		System.out.println("Order"+order);
		if(!duplicates.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static boolean checkDuplicateCharactersSingleLoop(String input) {
		System.out.println("input "+input);
		int inputLength = input.length()-1;
		for(int i=0;i<inputLength;i++) {
			System.out.println(i);
			System.out.println("i="+input.charAt(i) +" i+1="+input.charAt(i+1));
			if(String.valueOf(input.charAt(i)).equals(String.valueOf(input.charAt(i+1)))) {
				return true;
			}
				
		}
		
		
		return false;
	}

	private static boolean ifCharToBeSearchedPresent(String input, String duplicateString) {
		int count =0;
		for (int i = 0; i < input.length();i++) {
			if(duplicateString.equals(String.valueOf(input.charAt(i)))) {
				count++;
			}
		}
		if(count>1) {
			return true;
		}
		return false;
	}

}

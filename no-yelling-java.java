package challenges;

import java.util.*; 

public class Challenge6 {
	
	public static int first(char char_, char[] sentence) {
		
		
		int result = 0; 
		
		for (int x = 0; x < sentence.length; x++) {
			if (sentence[x] == char_) {
				result = x; 
				break; 
			}
		}
		
		return result; 
	}
	
	public static int last(char char_, char[] sentence) {
		
		int result = 0; 
		
		for (int x = 0; x < sentence.length; x++) {
			if (sentence[x] == '!')
			{
				if (x > result) 
					result=x; 
			}
		}
		return result; 
	}
	
	public static ArrayList<Character> doit (char[] sentence) {

		ArrayList<Character> sentence_2 = new ArrayList<Character>(); 
		for (int x = 0; x < sentence.length; x++) {
			if (sentence[x] == '!') {
				int y = first('!', sentence);
				System.out.println(y);
				int z = last('!', sentence); 
				if (x >= y) {
					sentence_2.add(sentence[x]); 
					System.out.println(x + " " + y);
					break; 
				}
			}else {
				if (sentence[x] == '?') {
					int y = first('?', sentence);
					System.out.println(y);
					int z = last('?', sentence); 
					if (x >= y) {
						sentence_2.add(sentence[x]); 
						System.out.println(x + " " + y);
						break; 
					}
				}else {
					sentence_2.add(sentence[x]); 
				}
			}
		}
		System.out.println(sentence_2);
		return sentence_2; 
	}
	public static String no_yelling(String sentence) {
		String result = ""; 
		
		char[] sentence_2 = sentence.toCharArray(); 
		
		ArrayList<Character> sentence_3 = doit(sentence_2); 
		
		for (int x = 0; x < sentence_3.size(); x++) {
			result+=sentence_3.get(x);
		}
		
		return result; 
	}
	public static void main(String[] args) {
		String sentence = "OH my GOSH!!!!!!"; 
		String no_yell = no_yelling(sentence); 
		System.out.println(no_yell);
	}
}

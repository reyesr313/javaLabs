package lab;

public class SixthLabb {
	public static String translateToPigLatin(String word){
		char c = word.charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			word = word + "way";
		} else {
			if (c == 'y') {
				word = word.substring(1);
				
				word = word + c;
				c = word.charAt(0);
			}
			word = word + "ay";
			}
		return word;
		}
	}



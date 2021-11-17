// Java program to check if two given strings are isomorphic or not
import java.io.*;
import java.util.*;
public class Isomorphism {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first string to check for isomorphism: ");
	String str1 = sc.nextLine();
	System.out.println("Enter second string to check for isomorphism: ");
	String str2 = sc.nextLine();
	System.out.println("Checking to see if " +str1 + " and " + str2 + " are isomorphic ...");
	System.out.println(isIso(str1, str2));
	}

	public static boolean isIso(String str1, String str2) {
	if(str1.length() != str2.length())
		return false;
	Map<Character, Character> map = new HashMap<>();

	for(int i = 0; i < str1.length(); i++){
		char char1 = str1.charAt(i);
		char char2 = str2.charAt(i);
		if(map.containsKey(char1)) {
		if(map.get(char1) != char2)
			return false;
		} else {
			if(map.containsValue(char2))
				return false;
			map.put(char1, char2);
		}
	}
	return true;
	}
}

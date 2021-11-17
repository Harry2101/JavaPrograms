// Java program to determine if two strings are anagrams of each other or not
import java.util.Arrays;
import java.io.*;

public class isAnagram {
	static void anagram(String str1, String str2) {
	// we are first going to replace all spaces with null character or remove all spaces
	String s1 = str1.replaceAll("\\s", "");
	String s2 = str2.replaceAll("\\s", "");

	int n1 = s1.length();
	int n2 = s2.length();
	boolean isanag = true;
	if (n1 != n2){
		isanag = false;
	}
	else {
		char[] Arr1 = s1.toLowerCase().toCharArray();
		char[] Arr2 = s2.toLowerCase().toCharArray();
		Arrays.sort(Arr1);
		Arrays.sort(Arr2);
		isanag = Arrays.equals(Arr1,Arr2);
	}

	if(isanag) {
		System.out.println(s1 + " and " + s2 + " are both anagrams of each other");
	} else {
		System.out.println(s1 + " and " + s2 + " are not anagrams of each other");
	}
	}

	public static void main(String args[]){
	anagram("Mother in Law", "Hitler Woman");
	anagram("Anagram", "nag a ram");
	anagram("Listen", "Silent");

	}
}

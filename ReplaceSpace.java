// Java Program to replace the spaces of a string with a specific character
import java.util.*;

public class ReplaceSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to replace all the spaces in it with a specific character: ");
		String str = sc.nextLine();
		System.out.println();
		System.out.print("Enter a character you would like to replace all the spaces in the string with: ");
		char ch = sc.next().charAt(0);

		str = str.replace(' ', ch);
		System.out.println();
		System.out.println(" String after replacement with char: ");
		System.out.println(str);
	}
}

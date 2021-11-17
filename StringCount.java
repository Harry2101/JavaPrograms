//Java String Count
import java.util.*;

public class StringCount {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to count its characters: ");
		String str = sc.nextLine();
		int i = 0;
		while (i < str.length()) {
			if(str.charAt(i) != ' ') {
				count++; }
			i++; }
		System.out.println();
		System.out.println(" The total characters in the string = " + count); }
	}

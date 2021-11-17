// Java program to find the reverse of a string

// there are two ways to do this, one is the iterative way, other is using inbuilt function with stringbuilder
import java.util.*;

public class ReverseString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter a string to reverse it: ");
		String str = sc.nextLine();
		// using StringBuilder
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println("Here is your string reversed: " + rev);
	}
}


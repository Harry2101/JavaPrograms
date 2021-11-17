// Java program to print the largest element in an array
public class LargestElement {
	public static void main(String[] args) {
		int arr[] = {4156, 2722, 5693, 6709, 2256, 7146, 6765, 15, 99, 2048};
		// randomly generated integers from random generator
		int max = arr[0];
		// setting the first element of the array as the temporary max to compare with other elements
		//now we loop through the array to compare if the element next to it is greater or not
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("The largest element in given array is: " +max);
	}
}

//Java Copy all elements of one array into another
public class ArrayCopy {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		int b[] = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		System.out.println();
		System.out.println("Printing values of both arrays a and b to see if they are the same");
		System.out.println();
		System.out.print("a: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("b: ");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}

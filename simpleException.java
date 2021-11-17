// Simple exeception handling scneario in java division by 0
public class simpleException{
	public static void main(String args[]){
		try{
		int sampledata = 2147483647/0;

		}catch(ArithmeticException ex) {
			System.out.println(ex);
		}
	System.out.println("If any exception was caught, it will be displayed above ^");
	}
}

package homework04;

public class LoopsPractice {
	
	public static void main(String[] args) {
		System.out.print("Factorial: " + factorial(-1));
	}
	
	
	public static int factorial(int n) {
		if(n < 0) {
			throw new IllegalArgumentException("You entered something negative");
		}
		int total = 1;
		for(int i = 1; i <= n; i++) {
			total = total * i;
			System.out.println("Total: "+ i + " " + total);
		}
		
		return total;
	}
}

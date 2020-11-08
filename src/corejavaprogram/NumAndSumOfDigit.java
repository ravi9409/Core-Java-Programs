package corejavaprogram;

public class NumAndSumOfDigit {
	public static void main(String[] args) {
		int count = 0, sum = 0, b = 0;
		int a = 12345;
		while (a != 0) {
			sum = a % 10 + sum;
			count++;
			b = b * 10;
			a = a / 10;
		}
		System.out.println("No of Digit is " + count);
		System.out.println("Sum of digit is " + sum);
	}

}

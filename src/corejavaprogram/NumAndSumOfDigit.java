package corejavaprogram;

import java.util.Scanner;

public class NumAndSumOfDigit {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number whose number and sum of digit you want t0 find");
		int a=scanner.nextInt();
		int count = 0, sum = 0, b = 0;
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

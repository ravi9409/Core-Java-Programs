package corejavaprogram;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number whose factorial you want to find");
		int a=scanner.nextInt();
		int mult=1;
		while(a!=0)
		{
			mult=mult*a;
			a--;
		}
		System.out.println(mult);	
	}
	
}

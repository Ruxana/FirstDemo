package BasicPrograms;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		num=s.nextInt();
		if(num%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd Number");
		}
	}

}

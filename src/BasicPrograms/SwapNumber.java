package BasicPrograms;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number a = ");
		a=s.nextInt();
		System.out.println("Enter number b = ");
		b=s.nextInt();
		//temp=a;
		//a=b;
		//b=temp;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Number in a = " +a);
		System.out.println("Number in b = " +b);

	}

}

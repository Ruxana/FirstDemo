package BasicPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int r,n=1234,sum=0;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println("Reverse of a number is " + sum);
	}

}

package BasicPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		int i,num=10,first=0,second=1,next;
		for(i=1;i<num;i++) {
			System.out.println(first);
			next=first+second;
			first=second;
			second=next;
		}

	}

}

package BasicPrograms;

public class ReverseWords {

	public static void main(String[] args) {
		
		String str[]="Hello Iam Ruxana".split(" ");
		String r =" ";
		for(int i=str.length-1;i>=0;i--) {
			r += str[i]+" ";
		}
		
		System.out.println(r);
	}

}

package BasicPrograms;

public class StringSplits {

	public static void main(String[] args) {
		String s="Hey what is going on"; //String literal
		String s1=new String("welcome");//using new
		
		String[] splitArray=s.split("is");
		System.out.println(splitArray[0]);
		System.out.println(splitArray[1]);
		//System.out.println(splitArray[2]);
		//System.out.println(splitArray[3]);
		System.out.println(splitArray[1].trim());
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.println(s1.charAt(i));
		}
	}

}

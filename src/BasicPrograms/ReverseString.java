package BasicPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Ruxana";
		char[] strArray=str.toCharArray();
		
		for(int i=strArray.length-1;i>=0;i--) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		StringBuffer sbf = new StringBuffer("Hello");
		System.out.println(sbf.reverse());
	}

}

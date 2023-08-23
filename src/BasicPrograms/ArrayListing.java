package BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListing {

	public static void main(String[] args) {
		String[] names= {"Ruxana","Javed","Falak","Gulnaz"};
		//List<String> a=new ArrayList<String>(); List is a super class
		ArrayList<String> a=new ArrayList<String>();
		a.add("This ");
		a.add("is a ");
		a.add("ArrayList ");
		//a.remove(0);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		//enhanced for loop
		/*
		 * for(String val:a) { System.out.println(val); }
		 */
		//Conversion of Array into ArrayList
		List<String> namesArray=Arrays.asList(names);
		//System.out.println(namesArray.contains("Javed"));
		for(String n:namesArray) {
			System.out.println(n);
		}
	}

}

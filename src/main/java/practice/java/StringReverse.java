package practice.java;

public class StringReverse {

	public static void main(String[] args) {
		String name = "shabana sarithala";
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
		
		
		
		String file = "divya";
		String reverseFile = "";
		for(int i=file.length()-1;i>=0;i--) {
			reverseFile = reverseFile+file.charAt(i);
		}
		System.out.println(reverseFile);
	}
	 
}

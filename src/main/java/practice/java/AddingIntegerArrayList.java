package practice.java;

public class AddingIntegerArrayList {

	public static void main(String[] args) {
		int sum = 0;
		int Array[] = { 2, 4, 5, 2, 34, 7, 9 };
		for (int i = 0; i < Array.length; i++) {
			sum = sum + Array[i];
		}

		System.out.println(sum);
		
		// get index of 5 in the above array
		for(int i=0;i<Array.length;i++) {
			if(Array[i]==7) {
				System.out.println(i);
			}
		}
	}

}

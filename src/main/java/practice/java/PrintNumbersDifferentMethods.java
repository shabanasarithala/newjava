package practice.java;

public class PrintNumbersDifferentMethods {

	public static void main(String[] args) {
		System.out.println("--------------------------using for loop----------------");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("---------------------Not using any numbers-----------------");
		int one = 'a' / 'a';
		String s = "..........";
		for (int i = one; i <= s.length(); i++) {
			System.out.println(i);
		}

		System.out.println("---------------Using ascii values---------------");
		for (int i = one; i <= 'd'; i++) {
			System.out.println(i);
		}
		System.out.println("---------------recursive function not using loops--------------");
		// recursive function not using loops
		printNumUsingRecursivefunction(1);
		System.out.println("---------------recursive function not using loops and any numbers--------------");
		// recursive function not using loops and no numbers in code
		printNumbers(1, 20);
	}

	public static void printNumUsingRecursivefunction(int num) {
		if (num <= 10) {
			System.out.println(num);
			num++;
			printNumUsingRecursivefunction(num);
		}
	}

	public static void printNumbers(int stNum, int endNum) {
		if (stNum <= endNum) {
			System.out.println(stNum);
			stNum++;
			printNumbers(stNum, endNum);
		}
	}
}

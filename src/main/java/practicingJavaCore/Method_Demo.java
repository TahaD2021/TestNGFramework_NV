package practicingJavaCore;

public class Method_Demo {

	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public static void sayHello(String name) {
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(10, 20, 30);
		sayHello("Taha");
		Method_Demo.add(22, 33, 44);

		System.out.println("***************************");
		// switch statement demo
		byte b = 0;
		switch (b) {

		case 89:
			System.out.println("Taha");
		case 70:
			System.out.println("Tayeb");
		case 80:
			System.out.println("Mahnaz");
		case 90:
			System.out.println("Fatemeh");
		default:
			System.out.println("no matching case");
		}
		// do-while loop demo
		int c = 0;
		do {
			System.out.println("Hi Mashooq");
			c++;
		} while (c < 10);
		System.out.println("condition not true");

		// while-Loop demo
		int d = 0;
		while (d < 6) {
			System.out.println("Hi Tayeb Jaan");
			d++;
		}
		// for-Loop demo
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				// break; // here "break" keyword used to get out of the rest of the loop when
				// riches to number 5.
				continue; // here "continue" keyword skips number "5" and continues from 6 to the end of
							// the loop
			}
			System.out.println(i);

		}
		// for-Each-Loop demo
		int[] j = { 12, 13, 14, 15 };
		for (int forEachLoop : j) {
			System.out.println(forEachLoop);

		}

		String str = "Taha";
		str.concat("Jaan");
		String string = new String("Tayeb Jaan");
		string.concat("Dowlati");
		System.out.println(str);
		System.out.println(string);
		StringBuffer sb = new StringBuffer("Mahnaz Jaan");
		sb.append("Dowlati");
		System.out.println(sb);

		String str1 = "Tayeb";
		String str2 = "Tayeb";
		System.out.println(str1.contentEquals(str2));
		// System.out.println(str1.compareTo(str2)); // if the values are equals it
		// returns "0", else it returns either positive or negative.

		// 2dimensional arrays
		int[][] numbers = { { 1, 12, 11, 22, 55 }, { 1, 25, 55, 66, 33 }, { 1, 25, 55, 66, 33 } };
		for (int i = 0; i < numbers.length; i++) {
			// System.out.print(" " + numbers[0][i]);
			for (int k = 0; k < numbers[i].length; k++) {
				System.out.print(" " + numbers[i][k]);
			}
			System.out.println();
		}

	}

}

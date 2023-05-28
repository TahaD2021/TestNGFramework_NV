import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingOddNubers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 22;
		if (n % 2 != 0) {
			System.out.println(n + " is an odd number");
		} else {
			System.out.println(n + " is not an odd number");
		}

		String var = "you made to tek school interview session";
		System.out.println(var.length());

		int[] a = { 12, 2, 33, 14, 7, 10 };
		Arrays.sort(a);
		// 1. method to print the value of the array
		System.out.println(Arrays.toString(a)); // 1. method to print the value of the array //1. method to print the
												// value of the array
		// 2. method to print the value of the array
		for (int feach : a)
			System.out.println(feach);
		// 3. method to print the value of the array
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		System.out.println("*********************************************");

		for (int v = 0; v < 3; v++) {
			for (int m = 3; m >= 0; m--) {
				if (v == m)
					continue;
				System.out.println(v + "" + m);

			}

			List<String> list = new ArrayList<String>();
			list.add("abc");
			list.add("def");
			list.add("Alex");
			list.add("Alex");
			list.add("abc");
			list.add("def");
			HashSet hs = new HashSet();
			for (int l = 0; l < list.size(); l++) {
				hs.add(list.get(l));

			}

			System.out.println("duplicate value is :" + hs);

		}
	}

}

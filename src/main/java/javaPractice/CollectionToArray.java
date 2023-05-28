package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

public class CollectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ar = { "aa", "bb", "cc" };
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(ar));
		al.add("Ahmad");
		al.add("Taha");
		for (String string : al) {
			System.out.println(string);
		}

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Hello");
		al1.add("Sir");

		String[] ar1 = new String[al1.size()];
		ar1[0] = "Testing array";
		al1.toArray(ar1);
		for (String string : ar1) {
			System.out.println(string);
		}
		System.out.println("After Iteration Example************\n");
		Iterator<String> it = al1.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Taha");
		ll.add("Mahnaz");
		ll.add("Fatemeh");
		ll.add("Mashooq");
		System.out.println(ll);

		System.out.println("\n\tAfter Manipulation Result....\n");
		ll.addFirst("Tayeb");
		ll.addLast("Amineh");
		System.out.println(ll);
//		fetching values of linkedList class using foreach loop
		for (String string : ll) {
			System.out.println("LinkedList Values Are:\n" + string);
		}
		ll.remove(5);
		System.out.println("LinkedList Values After Removal Are:\n" + ll);
//		fetching values of linkedList by using iterator cursor
		Iterator<String> it1 = ll.iterator();
		while (it1.hasNext()) {
			String linkedListValues = it1.next();
			System.out.println("linkedListValues are : \t" + linkedListValues);
			System.out.println(ll.isEmpty()); // should  returns false
			ll.clear();
			System.out.println(ll.isEmpty()); // should return true
		}

	}

}

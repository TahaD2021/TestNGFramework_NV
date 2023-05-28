import java.util.Arrays;
import java.util.Date;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date now = new Date();
		String s = "  Hello \n\tWorld";
		System.out.println(s.toLowerCase());
		//to print the value of the single array, we need to use tostring method as follow
		int[] numbers = {1,4,2,3,5};
		System.out.println(Arrays.toString(numbers));
		// to return the value of 2Dimensional arrays, we need to use deepToString method as follow
		int[][] num = new int[2][3];
		num[0][0] = 1;
		num[0][1] = 12;
		num[0][2] = 13;
		System.out.println(Arrays.deepToString(num));
		
		// in mathematics () has the highest prioritization in terms of value calculation or execution as follow
		// (), *, /, +, -
		int x = 10+5*2/5-5; // result = 5*2=10/5=2+10=12-5=7; 
		System.out.println(x); // so result = 7;
		
		int y = (10+5)*2/5-5; // result = (10+5)=15*2=30/5=6-5=1; 
		System.out.println(y); //s0 result = 1;
		
		
		
		int n = 22;
		if(n%2!=0) {
			System.out.println(n + "is an odd number");
		}else {
			System.out.println(n + "is not an odd number");
		}
	}

}

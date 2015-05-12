package W3D1;

import java.util.Scanner;
import java.util.Arrays;

public class anagrams {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		System.out.println("enter the first String ");
		String D1 = input.nextLine();

		System.out.println("enter the second String ");
		String D2 = input.nextLine();

		char[] a = null;
		char[] b = null;

		if (D1.length() == D2.length()) {
			a = D1.toCharArray();
			b = D2.toCharArray();

			Arrays.sort(a);
			Arrays.sort(b);

			if (Arrays.equals(a, b)) {
				System.out.println("they are equally so could say to be anagrams ");
			} else {
				System.out.println("they are not equally not anagrams");
			}

		} else {
			System.out.println("sorry do not muuch ");
		}
		input.close();
		input2.close();
	}
	/* out put 
	 * enter the first String 
       daniel
       enter the second String 
       leinad
       they are equally so could say to be anagrams 
	 */

}

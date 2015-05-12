package W3D1;
import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter a word to check is palindrome or not ");
		String word=input.nextLine();
		System.out.println(isPalindrome(word));
		input.close();
		
		
	}
	
	public static boolean isPalindrome(String s){
		int len =s.length();
		if(len<2){
			return true;
		}else if (s.charAt(0)!=s.charAt(len-1)){
			return true;
		}
	else {
		return isPalindrome(s.substring(1,len-1));
		
	}

}
	/* out put 
	 * enter a word to check is palindrome or not 
       bab
       true
	 * 
	 */
}

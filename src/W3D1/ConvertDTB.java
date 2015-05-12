package W3D1;
import java.util.Scanner;
public class ConvertDTB {
	public static void main(String[]args){
	Scanner input =new Scanner(System.in);	
	System.out.println("enter the number ");
	int x=input.nextInt();
	convert(x);
	input.close();
	
	}
	
	public static void convert(int num){
		if(num>0)
			convert(num/2);
		System.out.print(num%2 + " ");
	}
	
	/* out put 
	 * enter the number 
       123
       0 1 1 1 1 0 1 1 
	 * 
	 */

}


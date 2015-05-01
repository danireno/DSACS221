package W1D4;
import java.util.*;
public class CheckStackTest {
	public static void main(String[] args){
		
		int maxSize=10;
		CheckStack obj =new CheckStack(maxSize);
		
	while(true){
			
			
			System.out.println("what do you want to do :' 1 push' ,' 2 pop',' 3 peek', 4 quit");
			Scanner input =new Scanner(System.in);
			
			int ans=input.nextInt();
			int ans1;
			switch (ans){
			case 1:
				try{
				System.out.println("enter the number you want to push");
				 ans1=input.nextInt();
				obj.push(ans1);}
				catch (Exception e) {
					System.out.println(e.getMessage());}
				break;
			case 2:
				try{
				ans1 = obj.pop();
				System.out.println("you poped out "+ ans1);}
				 catch (Exception e) {
						System.out.println(e.getMessage());
				 }
				break;
			case 3:
				try{
				ans1=obj.peek();
				System.out.println("you picked out " + ans1);}
				 catch (Exception e) {
						System.out.println(e.getMessage());}
				 
				break;
			case 4:
				System.out.println("have a nice day ");
				return;
			default:
				System.out.println("in correct choose ");
			
					
				
			}
			/* out put
			 * what do you want to do :' 1 push' ,' 2 pop',' 3 peek', 4 quit
1
enter the number you want to push
12
what do you want to do :' 1 push' ,' 2 pop',' 3 peek', 4 quit
6
in correct choose 
what do you want to do :' 1 push' ,' 2 pop',' 3 peek', 4 quit

			 * 
			 */
			
	}
	}
}
			



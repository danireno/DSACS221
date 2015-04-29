
//import java.util.Random;

public class CheckRandom {

	public static void main(String args[]) {
		CheckRandomDrive obj = new CheckRandomDrive(50);
		obj.display();
		obj.generatRandom();
		obj.display();
		int[] sublist = obj.sublist(4, 8);
		for (int i = 0; i < sublist.length; i++) {
			System.out.println(sublist[i]);
		}
		System.out.println();

		obj.removeDuplicate();
		obj.display();
		obj.removeAll();
		obj.display();

	}
	/* out put
	 * 

	 * 
	 */
	

	
}

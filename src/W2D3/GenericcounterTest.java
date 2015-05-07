package W2D3;

public class GenericcounterTest {
	public static void main(String[] args) {
		Genericcounter obj = new Genericcounter(5);
		obj.insert(1);
		obj.insert(1);
		obj.insert(123);
		obj.insert(45);
		
		
		obj.display();

		System.out.println("there is dupulicate amount:"+obj.countOccurance());
	}
	
/* out put 
 * [1,1,123,45,]
there is dupulicate amount:2
 * 
 */
}

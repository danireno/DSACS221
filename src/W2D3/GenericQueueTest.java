package W2D3;

public class GenericQueueTest {
	public static void main(String[] args) {
		GenericQueue<Integer> obj = new GenericQueue<Integer>(12);
		obj.insert(1000);
		obj.insert(1234);

		obj.display();

		GenericQueue<String> obj1 = new GenericQueue<String>(12);

		obj1.insert("dani");
		obj1.insert("Teddy");
		obj1.remove();

		obj1.display();
		System.out.println(obj1.peekFront());
	}
	/* out put
	 * [1000,1234,]
       [dani,]
       Teddy
	 * 
	 */

}

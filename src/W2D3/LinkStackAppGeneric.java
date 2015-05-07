package W2D3;

public class LinkStackAppGeneric {
	public static void main(String[] args) {
		LinkStackGeneric<Float> theStack = new LinkStackGeneric<Float>(); // make
																			// stack
		LinkStackGeneric<Double> theStack2 = new LinkStackGeneric<Double>(); // make
																				// stack

		theStack.push(20.8f); // push items
		theStack.push(40.5f);

		theStack.displayStack(); // display stack

		theStack.push(60.8f); // push items
		theStack.push(80.5f);

		theStack.displayStack(); // display stack

		theStack.pop(); // pop items
		theStack.pop();
		theStack.displayStack(); // display stack
		theStack.pop();
		theStack.pop();
		System.out.println("Item Deleted : " + theStack.pop());
		theStack.displayStack(); // display stack

		System.out.println("for the double ");
		theStack2.push(2.2); // push items
		theStack2.push(7.9);

		theStack.displayStack(); // display stack

		theStack2.push(39.8); // push items
		theStack2.push(45.8);

		theStack2.displayStack(); // display stack

		theStack2.pop(); // pop items
		theStack2.pop();
		theStack2.displayStack(); // display stack
		theStack2.pop();
		theStack2.pop();
		System.out.println("Item Deleted : " + theStack2.pop());
		theStack2.displayStack(); // display stack
	} // end main()
	/* out put 
	 * Stack (top-->bottom): 40.5 20.8 
Stack (top-->bottom): 80.5 60.8 40.5 20.8 
Stack (top-->bottom): 40.5 20.8 
Item Deleted : null
Stack (top-->bottom): 
for the double 
Stack (top-->bottom): 
Stack (top-->bottom): 45.8 39.8 7.9 2.2 
Stack (top-->bottom): 7.9 2.2 
Item Deleted : null
Stack (top-->bottom): 

	 * 
	 */

}
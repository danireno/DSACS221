package W1D5;

class PriorityQApp {
	
	public static void main(String[] args) {
		
		revisedPriorityQ thePQ = new revisedPriorityQ(5);
		
		thePQ.insert(10);
		thePQ.insert(55);
		thePQ.insert(22);
		thePQ.insert(99);
		thePQ.insert(88);

		while (!thePQ.isEmpty()) {
			long item = thePQ.remove();
			System.out.print(item + " ");
		}
		System.out.println("");
	} 
	
/*
 * out put 
 * 10 22 55 88 99 

 */
}



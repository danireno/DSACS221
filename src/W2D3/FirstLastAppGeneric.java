package W2D3;

class FirstLastAppGeneric {
	public static void main(String[] args) { // make a new list
		FirstLastList<Integer> theList = new FirstLastList<Integer>();

		theList.insertFirst(22); // insert at front
		theList.insertFirst(44);
		theList.insertFirst(66);

		theList.insertLast(11); // insert at rear
		theList.insertLast(33);
		theList.insertLast(55);

		theList.displayList(); // display the list
		theList.deleteFirst(); // delete first two items
		theList.displayList(); // display again

		FirstLastList<String> theList2 = new FirstLastList<String>();
		theList2.insertFirst("Daniel"); // insert at front
		theList2.insertFirst("Teddy");
		theList2.insertFirst("biruk");

		theList2.insertLast("A"); // insert at rear
		theList2.insertLast("B");
		theList2.insertLast("C");

		theList2.displayList(); // display the list
		theList2.deleteFirst(); // delete first two items
		theList2.displayList(); // display again

	} // end main()
	/* out 
	 * List (first-->last): 66 44 22 11 33 55 
List (first-->last): 44 22 11 33 55 
List (first-->last): biruk Teddy Daniel A B C 
List (first-->last): Teddy Daniel A B C 
	 * 
	 */
} // end class FirstLastApp


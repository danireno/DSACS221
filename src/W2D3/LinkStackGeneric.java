package W2D3;

class LinkStackGeneric<D> {
	private LinkList1Generic theList;

	// --------------------------------------------------------------
	public LinkStackGeneric() // constructor
	{
		theList = new LinkList1Generic();
	}

	// --------------------------------------------------------------
	public void push(D j) // put item on top of stack
	{
		theList.insertFirst(j);
	}

	// --------------------------------------------------------------
	public D pop() // take item from top of stack
	{
		if (!isEmpty()) {
			return (D) theList.deleteFirst();
		}
		return null;
	}

	// --------------------------------------------------------------
	public boolean isEmpty() // true if stack is empty
	{
		return (theList.isEmpty());
	}

	// --------------------------------------------------------------
	public void displayStack() {
		System.out.print("Stack (top-->bottom): ");
		theList.displayList();
	}
	// --------------------------------------------------------------
} // end class LinkStack

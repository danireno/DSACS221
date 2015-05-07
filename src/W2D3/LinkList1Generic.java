package W2D3;

class LinkList1Generic<D> {
	class Link {
		public D dData; // data item
		public Link next; // next link in list
		// -------------------------------------------------------------

		public Link(D dd) // constructor
		{
			dData = dd;
		}

		// -------------------------------------------------------------
		public void displayLink() // display ourself
		{
			System.out.print(dData + " ");
		}
	} // end class Link

	private Link first; // ref to first item on list
	// -------------------------------------------------------------

	public LinkList1Generic() // constructor
	{
		first = null;
	} // no items on list yet
	// -------------------------------------------------------------

	public boolean isEmpty() // true if list is empty
	{
		return (first == null);
	}

	// -------------------------------------------------------------
	public void insertFirst(D dd) // insert at start of list
	{ // make new link
		Link newLink = new Link(dd);
		newLink.next = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

	// -------------------------------------------------------------
	public D deleteFirst() // delete first item
	{ // (assumes list not empty)
		Link temp = first; // save reference to link
		first = first.next; // delete it: first-->old next
		return temp.dData; // return deleted link
	}

	// -------------------------------------------------------------
	public void displayList() {
		Link current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
	// -------------------------------------------------------------
} // end class LinkList

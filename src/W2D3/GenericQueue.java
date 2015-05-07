package W2D3;

public class GenericQueue<D> {
	private int maxSize;
	private D[] queArray;
	private int front;
	private int rear;
	private int nItems;

	// --------------------------------------------------------------
	public GenericQueue(int s) // constructor
	{
		maxSize = s;
		queArray = (D[]) new Object[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	// --------------------------------------------------------------
	public void insert(D j) // put item at rear of queue
	{
		if (rear == maxSize - 1) // deal with wraparound
		{
			rear = -1;
		}
		queArray[++rear] = j; // increment rear and insert
		nItems++; // one more item
	}

	// --------------------------------------------------------------
	public D remove() // take item from front of queue
	{
		D temp = queArray[front++]; // get value and incr front
		if (front == maxSize) // deal with wraparound
		{
			front = 0;
		}
		nItems--; // one less item
		return temp;
	}

	// --------------------------------------------------------------
	public D peekFront() // peek at front of queue
	{
		return queArray[front];
	}

	// --------------------------------------------------------------
	public boolean isEmpty() // true if queue is empty
	{
		return (nItems == 0);
	}

	// --------------------------------------------------------------
	public boolean isFull() // true if queue is full
	{
		return (nItems == maxSize);
	}

	// --------------------------------------------------------------
	public int size() // number of items in queue
	{
		return nItems;
	}

	public void display() {
		StringBuilder bd = new StringBuilder("[");
		for (int i = 0; i < nItems; i++) {
			bd.append(queArray[i] + ",");
		}
		bd.append("]");
		System.out.println(bd.toString());

	}
	// --------------------------------------------------------------
} // end class Queue

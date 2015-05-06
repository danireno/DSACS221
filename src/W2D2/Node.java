package W2D2;

class Node {

	public String value;
	public Node next;
	public Node previous;

	public Node(String value) {
		this.value = value;
		this.next = null;
		this.previous = null;
	}

	public String toString() {
		return value;
	}
}



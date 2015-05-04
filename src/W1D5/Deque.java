package W1D5;

public class Deque {
	private int[] data;
	private int size;
	private int capacity;
	
	private final int DEFAULT_SIZE = 10;
	
	
	
	public Deque(int capacity2) {
    this.capacity = capacity;
		
		if(this.capacity < DEFAULT_SIZE)
			this.capacity = DEFAULT_SIZE;
		
		data = new int[this.capacity];
		size = 0;
	}// TODO Auto-generated constructor stub
	

	public void insertLeft(int n) throws Exception {
		if(isFull())
			throw new Exception("Deque is full.");
			
		if(isEmpty()){
			data[size++] = n;
		} else {
			for(int i = size; i > 0; i--){
				data[i] = data[i - 1];
			}
			data[0] = n;
			size++;
		}
	}
	
	public void insertRight(int n) throws Exception{
		if(isFull())
			throw new Exception("Deque is full.");
		
		data[size++] = n;
	}
	
	public int removeLeft() throws Exception{
		if(isEmpty())
			throw new Exception("Deque is empty.");
		
		int result = data[0];
		for(int i = 0; i < size - 1; i++){
			data[i] = data[i + 1];
		}
		size--;
		
		return result;
	}
	
	public int removeRight() throws Exception{
		if(isEmpty())
			throw new Exception("Deque is empty.");
		
		return data[--size];
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public boolean isFull(){
		return size == capacity;
	}
}

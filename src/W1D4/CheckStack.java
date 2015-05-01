package W1D4;

public class CheckStack {
	
	private int maxSize;
	private int[]StackArray;
	private int top;
	
 CheckStack(int n){
		
		maxSize=n;
		StackArray=new int [maxSize];
		top=-1;
	}
	
	public void push(int i )throws Exception {
		if(!isFull()){
		StackArray[++top]=i;
	}
		else {
			throw new Exception ("it is full");
		}
	}
	
	public int pop()throws Exception{
		if(!isEmpty()){
			return StackArray[top--];	
		}
		else {
			throw new Exception ("it is empty");
		}
	}
	
	public int peek()throws Exception{
		if(!isEmpty()){
		return StackArray[top];
		}
		else {
			throw new Exception ("it is empty");
		}
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public boolean isFull(){
		return (top==maxSize-1);
	}
	
	public void display(){
		StringBuffer sd =new StringBuffer("[");
		for(int i=0;i<top;i++){
			sd.append(StackArray[i] + ", ");
		}
		sd.append("]");
		System.out.println(sd.toString());
	}
 
}

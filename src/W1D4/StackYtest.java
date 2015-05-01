package W1D4;

class StackYtest {

	public static void main(String[] args) {
		StackY theStack = new StackY(5); 
		
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		theStack.push(60);
		
		System.out.println(theStack.size()+1);
		System.out.println(theStack.isElement(20));
		System.out.println(theStack);
		
		theStack.pop();
		theStack.pop();
		theStack.pop();
		theStack.pop();
		theStack.pop();
		theStack.pop();
		
		theStack.clear();
		System.out.println("the stack is clear.");
		
		StackY s1 = new StackY(2);
		StackY s2 = new StackY(2);
		
		
		s1.push(30);
		s1.push(22);
		
		s2.push(12);
		s2.push(14);
		
		StackY s3 = merge(s1, s2);
		System.out.println(s3);
	} 
	
	public static StackY merge(StackY s1, StackY s2 ){
		StackY s3 = new StackY(s1.size() + s2.size());
		while(!s1.isEmpty()){
			s3.push(s1.pop());
		}
		while(!s2.isEmpty()){
			s3.push(s2.pop());
		}
		return s3;
	}
	/* out put Can’t insert, stack is full
6
true
[ 50 40 30 20 10 ]
Can’t Delete, stack is empty
the stack is clear.
[ 12 14 30 22 ]

	 * 
	 */
}
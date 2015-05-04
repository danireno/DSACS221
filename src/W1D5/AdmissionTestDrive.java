package W1D5;
import java.util.LinkedList;
import java.util.Queue;




public class AdmissionTestDrive {
	
	public static void main (String args[]){
		
		Queue<Admission> queue = new LinkedList<Admission>();
		
		String names [] = {"A", "B", "C", "D", "E"};
		int numbers [] = {1, 2, 3, 4, 5};
		
		
		for (int i = 0; i < 5; i++){
			queue.add(new Admission(i + 1, names[i], numbers[i]));
		}
		
		
		
		System.out.println("The peek element is: " + queue.peek());
		System.out.println("The size of the queue is: " + queue.size());
		
		System.out.println("contents of the queue are: ");
		
		while(!queue.isEmpty()){
			System.out.println(queue.remove());
		}
		System.out.println("cheking the queue is empty or not :" + queue.isEmpty());
		
		
		
	}
/*
 * The peek element is: 1 A 1
The size of the queue is: 5
contents of the queue are: 
1 A 1
2 B 2
3 C 3
4 D 4
5 E 5
cheking the queue is empty or not :true


 */

}

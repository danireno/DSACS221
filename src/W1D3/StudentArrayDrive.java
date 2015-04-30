package W1D3;

public class StudentArrayDrive {
	public static void main(String[] args) {

		StudentArray stu = new StudentArray(6);
		try {
			stu.inser(001, "daniel", 89);
			stu.inser(002, "teddy", 90);
			stu.inser(003, "sisay", 40);
			stu.inser(004, "selam", 82);
			stu.inser(005, "debela", 98);			
		} catch (StudentExistsException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		stu.displayAll();
		
		stu.delete(001);

		stu.displayAll();

		Student found;

		found = stu.find(001);

		if (found != null)
			System.out.println("you are in ");

		else
			System.out.println("not in ");

		// stu.delete(003);

		stu.displayAll();

		System.out.println("The maximum score is: " + stu.max());
		System.out.println("The minimum score is: " + stu.min());

	}
	/* out put 
	 * [Id: 1; Name: daniel; Mark: 89]
[Id: 2; Name: teddy; Mark: 90]
[Id: 3; Name: sisay; Mark: 40]
[Id: 4; Name: selam; Mark: 82]
[Id: 5; Name: debela; Mark: 98]
[Id: 2; Name: teddy; Mark: 90]
[Id: 3; Name: sisay; Mark: 40]
[Id: 4; Name: selam; Mark: 82]
[Id: 5; Name: debela; Mark: 98]
not in 
[Id: 2; Name: teddy; Mark: 90]
[Id: 3; Name: sisay; Mark: 40]
[Id: 4; Name: selam; Mark: 82]
[Id: 5; Name: debela; Mark: 98]
The maximum score is: 98
The minimum score is: 40
	 * 
	 */

}

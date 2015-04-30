package W1D3;

public class Student {
	
	
	private int id;
	private String name;
	private int mark;
	
	
	
	public Student(int id2, String name2, int mark2) {
		this.id=id2;
		this.name=name2;
		this.mark=mark2;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		
		builder.append("[Id: ").append(id);
		builder.append("; Name: ").append(name);
		builder.append("; Mark: ").append(mark).append("]");
		
		return builder.toString();
	}

	public void displayStudent(){
		System.out.println(" Id :"  + id );
		System.out.println(" name :" + name);
		System.out.println(" mark :" + mark);
	}
	
	public int getId(){
		return id;
	}
	
	public int getMark(){
		return mark;
	}
	
	

}

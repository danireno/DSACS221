package W1D5;

public class Admission {
	
	private int adno; 
    private String name; 
    private int pno;  
    
    
    public Admission(int adno2, String name2, int pno2) {
    	this.adno = adno2;
    	this.name = name2;
    	this.pno = pno2;
    	    	
	}
	public String toString(){
    	return adno + " " + name + " " + pno;
    }
}
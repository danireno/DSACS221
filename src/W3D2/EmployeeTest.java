package W3D2;

public class EmployeeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeOpr eo = new EmployeeOpr();
		eo.insert(100, "dani");
		eo.insert(90, "teddy");
		eo.insert(130, "addis");
		eo.insert(115, "mena");
		eo.insert(76, "zeray"); 
		eo.insert(95, "simon"); 
		eo.insert(145, "mewie"); 
		System.out.println("In-order traversal");
		eo.inOrder(eo.getRoot());
       
		System.out.println("\nEmployee Exist(100) : " + eo.find(100));
        System.out.println("\nEmployee Exist(1000) : " + eo.find(1000));
        
        System.out.println("post order traversal ");
		eo.postOrderTraverseTree(eo.getRoot());
	   
		System.out.println("\nEmployee Exist(115) : " + eo.find(100));
	    System.out.println("\nEmployee Exist(19) : " + eo.find(1000));
		
        
        Employee max=eo.maximum();
        System.out.println("the maximum is  " + max);
        
        Employee min=eo.minimum();
        System.out.println("the minmum  " + min);
        
        System.out.println("Leaf nodes: " + eo.countleaf(eo.getRoot()));
        
       
	}
	/* out put 
	 * In-order traversal
76 , zeray
90 , teddy
95 , simon
100 , dani
115 , mena
130 , addis
145 , mewie

Employee Exist(100) : true

Employee Exist(1000) : false
post order traversal 
76,zeray
95,simon
90,teddy
115,mena
145,mewie
130,addis
100,dani

Employee Exist(115) : true

Employee Exist(19) : false
the maximum is  mewie 145
the minmum  zeray 76
Leaf nodes: 4

	 * 
	 */
	

}
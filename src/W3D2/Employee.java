package W3D2;

class Employee
{
	int id;
	String name;
	Employee leftChild,rightChild;
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	void displayEmployee()
	{
		System.out.println(id + ", " + name);
	}
	public String toString(){
		return name + " " + id;
	}
	
}

class EmployeeOpr
{
	Employee root;
	EmployeeOpr()
	{
		root = null;
	}
	public boolean find(int key)      // find Employee with given key
	   {                           // (assumes non-empty tree)
		Employee  current = root;               // start at root
	   while(current.id != key)        // while no match,
	      {
	      if(key < current.id)         // go left?
	         current = current.leftChild;
	      else                            // or go right?
	         current = current.rightChild;
	      if(current == null)             // if no child,
	         return false;                 // didn't find it
	      }
	   return true;                    // found it
	   }  // end find()
	
	public void insert(int x, String n)
	   {
	   Employee newEmployee = new Employee(x,n);    // make new Employee
	  
	   if(root==null)                // no Employee in root
	      root = newEmployee;
	   else                          // root occupied
	      {
	      Employee current = root;       // start at root
	      Employee parent;
	      while(true)                // (exits internally)
	         {
	         parent = current;
	         if(newEmployee.id < current.id)  // go left?
	            {
	            current = current.leftChild;
	            if(current == null)  // if end of the line,
	               {                 // insert on left
	               parent.leftChild = newEmployee;
	               return;
	               }
	            }  // end if go left
	         else                    // or go right?
	            {
	            current = current.rightChild;
	            if(current == null)  // if end of the line
	               {                 // insert on right
	               parent.rightChild = newEmployee;
	               return;
	               }
	            }  // end else go right
	         }  // end while
	      }  // end else not root
	   }  // end insert()
	//-------------------------------------------------------------
	void inOrder(Employee localRoot)
	   {
	   if(localRoot != null)
	      {
	      inOrder(localRoot.leftChild);
	      System.out.println(localRoot.id + " , " +localRoot.name);
	      inOrder(localRoot.rightChild);
	      }
	   }
	public void postOrderTraverseTree(Employee localRoot) {
		 
        if (localRoot != null) {
 
            postOrderTraverseTree(localRoot.leftChild);
           
            postOrderTraverseTree(localRoot.rightChild);
            
            System.out.println(localRoot.id + "," + localRoot.name);
 
            
 
        }
   
 
    }
	public int  countleaf(Employee localRoot) {
		 
        if (localRoot != null ){ 
             if(localRoot.leftChild==null && localRoot.rightChild==null)
        		return 1;             
             else 
             	return countleaf(localRoot.leftChild) + countleaf(localRoot.rightChild);
        
        }
        
        return 0;
   }
   
	
	public Employee minimum(){
		Employee current,last = null;
		current=root;
		while(current!=null){
			last=current;
			current=current.leftChild;
		}
		return last;
	}

	public Employee maximum(){
		Employee current,last = null;
		current=root;
		while(current!=null){
			last=current;
			current=current.rightChild;
		}
		return last; 
	}
	
	//-------------------------------------------------------------
	Employee getRoot()
	{
		return root;
	}

}
package W1D3;

import java.util.ArrayList;

public class LibraryTestDrive {
public static void main (String args[]){
	 
		ArrayList<Library> lib = new ArrayList<Library>();
		
		System.out.println("Initial size of al: " + lib.size());
		
		lib.add(new Library(1234, "nice", "Data structure",12.56));
		lib.add(new Library(1234, "one", "OOP",12.56));
		lib.add(new Library(1234, "two", "Phython",12.56));
		lib.add(new Library(1234, "three", "Database",12.56));
		lib.add(new Library(1234, "four", "Data structure",12.56));
		
		System.out.println("Size of al after additions: " + lib.size());
		System.out.println("Contents of Library: " + lib);
		
		lib.remove(1);
		
		System.out.println("Size of al after deletion: " + lib.size());
		
		System.out.println(lib.isEmpty());
		
		Library obj = lib.get(1);
		System.out.println(obj);
		
		double total = 0;
		for (Library l : lib){
			if(l.getBookName().equals("Data structure")){
				total += l.getPrice();				
			}
		}
		System.out.println("Total selleing price of book : $" + total);	
		
	}
/* out put
 * Initial size of al: 0
Size of al after additions: 5
Contents of Library: [Data structure 12.56, OOP 12.56, Phython 12.56, Database 12.56, Data structure 12.56]
Size of al after deletion: 4
false
Phython 12.56
Total selleing price of book : $25.12
 * 
 */

}

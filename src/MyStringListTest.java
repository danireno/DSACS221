
public class MyStringListTest {
	
	public static void main(String args[]) {

		MyStringList sa = new MyStringList ();

		sa.insert("london");
		sa.insert("ethiopia");
		sa.insert("indian");
		sa.insert("usa");
		System.out.println(sa.size());
		sa.insert("italy");
		System.out.println(sa.size());
		sa.insert("germony");

		sa.display();

		try {
			System.out.println(sa.get(20));
		} catch (Exception e) {

		}

		sa.insertString("zambia", 2);

		sa.display();

		sa.delete(0);

		sa.display();

		System.out.println(sa.find("ethiopia"));
	}
	/* out put 
	 * 4
resizing
5
----------
| 0 | london |
----------
| 1 | ethiopia |
----------
| 2 | indian |
----------
| 3 | usa |
----------
| 4 | italy |
----------
| 5 | germony |
----------
----------
| 0 | london |
----------
| 1 | ethiopia |
----------
| 2 | zambia |
----------
| 3 | indian |
----------
| 4 | usa |
----------
| 5 | italy |
----------
| 6 | germony |
----------
----------
| 0 | ethiopia |
----------
| 1 | zambia |
----------
| 2 | indian |
----------
| 3 | usa |
----------
| 4 | italy |
----------
| 5 | germony |
----------
true

	 */
}
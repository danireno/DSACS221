package W1D3;

public class StudentArray {
	private Student[] a;
	private int nElem;

	public StudentArray(int max) {
		a = new Student[max];
		nElem = 0;
	}

	public Student find(int id) {
		int i;
		for (i = 0; i < nElem; i++)
			if (a[i].getId() == id)
				break;
		if (i == nElem)
			return null;
		else
			return a[i];

	}

	public void inser(int id, String name, int mark) throws StudentExistsException, IndexOutOfBoundsException {
		
		if (nElem < a.length) {
			if(find(id) == null){
				a[nElem] = new Student(id, name, mark);
				nElem++;
			} else {
				throw new StudentExistsException("A student with id " + id + " already exists.");
			}
		} else {
			throw new IndexOutOfBoundsException("Array is full.");
		}
	}

	public boolean delete(int id) {
		
		int i;
		for (i = 0; i < nElem; i++)
			if (a[i].getId() == id)
				break;
		if (i == nElem)
			return false;

		else {
			for (int k = i; k < nElem - 1; k++)
				a[k] = a[k + 1];
			nElem--;
			a[nElem] = null;
			return true;
		}

	}

	public void displayAll() {

		for (int i = 0; i < nElem; i++) {
			System.out.println(a[i]);
		}

	}

	public int  max() {

		int max = a[0].getMark();
		for (int i = 0; i < nElem; i++)

			if (max < a[i].getMark()) {
				max = a[i].getMark();

			}

			else {
				max = max;
			}

		return max;
		//System.out.println("the max is:" + max);
	}

	public int min() {

		int min = a[0].getMark();
		for (int i = 0; i < nElem; i++)

			if (min > a[i].getMark()) {
				min = a[i].getMark();

			}

			else {
				min = min;
			}
		return min;
		//System.out.println("the min is:" + min);
	}

}

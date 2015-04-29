import java.util.Random;


public class CheckRandomDrive {
	private int[] a;

	

	public CheckRandomDrive(int size) {
		a = new int[size];
	}

	public void generatRandom() {
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(50);
		}
	}

	public void display() {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
	}

	public void removeDuplicate() {

		boolean[] temp = new boolean[50];
		int newSize = 0;
		for (int i = 0; i < a.length; i++) {
			if (temp[a[i]] == false) {
				newSize++;
				temp[a[i]] = true;
			}

		}
		int[] result = new int[newSize];
		int k = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == true) {
				result[k] = i;
				k++;
			}
		}

		a = result;
	}

	public void removeAll() {
		for (int i = 0; i < a.length; i++) {
			a[i] = 0;
		}

	}

	public int[] sublist(int startIndex, int endIndex) {
		int[] temp = new int[endIndex - startIndex + 1];
		System.arraycopy(a, startIndex, temp, 0, temp.length);
		return temp;

	}


}

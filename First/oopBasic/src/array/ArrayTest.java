package array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		int total = 0;
		
		for (int i=0, num=0; i<arr.length; i++, num++) {
			arr[i] = num;
		}
		
		for (int i=0; i<arr.length; i++) {
			total += arr[i];
			System.out.println(total);
		}
	}

}

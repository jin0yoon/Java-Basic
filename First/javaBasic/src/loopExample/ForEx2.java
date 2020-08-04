package loopExample;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int count;
		int result = 0;
		
		for (num = 2; num < 10; num++) {
			for (count = 1; count < 10; count++) {
				result = num * count;
				System.out.println(result);
			}
		}
		
		
		//--------------------------------------------
		
		int num2 = 2;
		int count2 = 1;
		int result2 = 0;
		
		while (num2 < 10) {
			while (count2 < 10) {
				result2 = num2 * count2;
				System.out.println(result2);
				count2++;
			}
			num2++;
			count2 = 0;
		}
	}

}

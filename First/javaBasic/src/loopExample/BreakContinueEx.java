package loopExample;

public class BreakContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int count;
		
		for (num=2; num < 10; num++) {
			
			if ((num % 2) != 0) continue;
			
			for (count=1; count < 10; count++) {
				
				if (num < count) break;
				
				System.out.println(num * count);
			}
		}
	}

}

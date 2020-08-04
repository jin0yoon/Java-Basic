package loopExample;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		int sum = 0;
		
		while (num <= 10) {
			sum += num;
			num+=2;
		}
		
		System.out.println(sum);
		System.out.println(num);
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		int input;
//		int sum = 0;
//		
//		input = scanner.nextInt();
//		
//		while(input != 0) {
//			sum += input;
//			input = scanner.nextInt();
//		}
//		
//		System.out.println(sum);
		
	}

}

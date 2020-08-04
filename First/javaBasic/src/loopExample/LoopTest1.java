package loopExample;

import java.util.Scanner;

public class LoopTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int result = 0;
		
		String operator = scanner.next();
		
		if (operator.equals("plus")) {
			result = num1 + num2;
		}else if(operator.equals("min")) {
			result = num1 - num2;
		}else if(operator.equals("mul")) {
			result = num1 * num2;
		}else {
			result = num1 / num2;
		}
		
		switch(operator) {
			case "plus":
				result = num1 + num2;
				break;
			case "min":
				result = num1 - num2;
				break;
			case "mul":
				result = num1 * num2;
				break;
			default:
				result = num1 / num2;
		}
		
		System.out.println(result);
	}

}

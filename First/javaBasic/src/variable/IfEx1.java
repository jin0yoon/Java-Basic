package variable;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		
		char gender = 'F';
		
		if (gender == 'F') {
			System.out.println("여성입니다.");
		}else {
			System.out.println("여성이 아닙니다.");
		}
		
		//---------------------------------------
		
		Scanner scanner = new Scanner(System.in); //입력 
		
		int age = scanner.nextInt();
		
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
		}else if(age < 14){
			charge = 1500;
		}else if(age < 20){
			charge = 2000;
		}else {
			charge = 3000;
		}
		
		System.out.println("나이 : " + age);
		System.out.println("요금 : " + charge);
	}
}

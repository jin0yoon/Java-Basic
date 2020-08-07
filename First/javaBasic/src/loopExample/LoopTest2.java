package loopExample;

import java.util.Scanner;

public class LoopTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int height = scanner.nextInt();
		int line;
		int blank;
		int star;
	
		
		 //하나씩 증가하는 코드 
		for (line=1; line<height; line++) {
			//빈칸을 그리는 부분
			for (blank=height-line; blank>1; blank--) {
				System.out.print(" ");
			}
			//왼쪽 별을 그리는 부분
			for (star=1; star<=line; star++) {
				System.out.print("*");
			}
			//오른쪽 별을 그리는 부분
			for (star=1; star<=line-1; star++) {
				System.out.print("*");
			}
			System.out.println(""); //줄바꿈 
		}
		
		//하나씩 감소하는 코드 
		for (line=height-2; line>=1; line--) {
			//빈칸을 그리는 부분
			for (blank=height-line; blank>1; blank--) {
				System.out.print(" ");
			}
			//왼쪽 별을 그리는 부분
			for (star = 1; star<=line-1; star++) {
				System.out.print("*");
			}
			//오른쪽 별을 그리는 부분
			for (star = 1; star<=line; star++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

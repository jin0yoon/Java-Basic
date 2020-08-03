package variable;

public class OperatorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int score = 100;
		
		System.out.println(++score);  //대입 연산자의 의미가 있
//		score = score + 1;
//		score += 1;
		//위의 3개가 다 같은 의미
		
		System.out.println(score++); //먼저 대입 후 증가하므로 출력값은 증가하지 않은 값
		System.out.println(score);  //다시 출력해보면 1 증가한 값이 출력됨을 확인
		
		System.out.println(--score);
		System.out.println(score--);
		System.out.println(score);
	}

}

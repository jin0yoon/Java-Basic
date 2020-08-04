package variable;

public class OperatorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int score = 100;
		
		System.out.println(++score);  //먼저 증가된 후 값이 대입되므로 출력값은 증가한 값. 대입 연산자의 의미가 있음 
//		score = score + 1;
//		score += 1;
		//위의 3개가 다 같은 의미
		
		System.out.println(score++); //먼저 대입 후 증가하므로 출력값은 증가하지 않은 값
		System.out.println(score);  //다시 출력해보면 1 증가한 값이 출력됨을 확인
		
		System.out.println(--score);  //먼저 감소 후 값이 대입되므로 출력값은 감소한 값. 
		System.out.println(score--);  //먼저 대입 후 감소하므로 출력값은 감소하지 않은 값 
		System.out.println(score);    //다시 출력해보면 1 감소한 값이 출력됨을 확인 
	}

}

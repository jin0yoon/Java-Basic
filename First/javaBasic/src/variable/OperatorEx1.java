package variable;

public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = -1;
		int num2 = 20;
		
		System.out.println(+num1);
		System.out.println(+num2);
		//+는 부호가 유지
		
		System.out.println(-num1);
		System.out.println(-num2);
		//-는 부호가 바뀜
		//그 값을 참조해서 결과값만 가지고 쓰는거지 그 변수 자체의 메모리에 가서 값을 바꾸는 것은 아님 
		
		System.out.println(num1);
		System.out.println(num2);
		//다시 출력해보면 값이 바뀌지 않은 것을 알 수 있음 
		
		num1 = -num1;   //이렇게 assign을 해야 그 값이 바뀜 
		
		System.out.println(num1);
	}

}

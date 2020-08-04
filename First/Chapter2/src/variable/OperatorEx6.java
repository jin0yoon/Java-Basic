package variable;

public class OperatorEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int num1 = 0B00001010; //10
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2);  //둘다 1인 비트가 없으므로 결과는 0
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		System.out.println(num2 << 1);  //0B00001010이 됨
		System.out.println(num2 << 2);  //0B00010100이 됨
		//변수 값이 변하지는 않음. 변하게 하려면 대입 연산자를 같이 써야함
		System.out.println(num2 <<= 1);
		
		System.out.println(num2 >> 2);  //0B00000010이 됨
		
	
	}

}

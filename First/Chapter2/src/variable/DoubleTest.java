package variable;

public class DoubleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dNum = 3.14;
		
//		float fNum = 3.14;  //기본적으로 실수는 double로 저장되므로 오류가 발생
		float fNum = 3.14F;
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		//---------------------------------------------------------------
		
		double dNum2 = 1;
		
		for(int i=0; i<10000; i++) {
			dNum2 = dNum2 + 0.1;
		}
		
		System.out.println(dNum2);  //부동 소수점 오차가 발생함
		
		//---------------------------------------------------------------
		
		boolean isMarried = false;
		
		System.out.println(isMarried);
		
	}

}

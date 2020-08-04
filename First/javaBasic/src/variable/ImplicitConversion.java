package variable;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		//---------------묵시적 형변환-----------------------------------------------------------------

		byte bNum = 10;
		int iNum = bNum;  //묵시적으로 형변환이 일어남
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		
		int iNum2 = 20;
		float fNum = iNum2;  //묵시적으로 형변환이 일어남 
		
		System.out.println(fNum);
		
		
		double dNum;
		dNum = fNum + iNum2;  //2번의 형변환이 일어남.1. iNum2가 float형으로 변환. 2.더한 결과값이 double형으로 변환
		
		System.out.println(dNum);
		
		
		//---------------명시적 형변환-----------------------------------------------------------------
		
		int i = 1000;
		byte bNum2 = (byte)i;  //데이터 유실이 발생할 수 있음
		System.out.println(bNum2);
		
		double dNum3 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum3 + (int)fNum2;  //형 변환이 될 때 소수점 뒷자리는 사라짐. 그러므로 1 + 0이 되어서 결과는 1이 됨
		int iNum4 = (int)(dNum3 + fNum2);   //더한 후 형 변환이 되므로 2.1의 소수점 뒷자리가 사라지면 2가 됨
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
	
	}

}

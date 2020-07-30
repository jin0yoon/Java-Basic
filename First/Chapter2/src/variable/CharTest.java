package variable;

public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		int iCh = 66;
		System.out.println(iCh);
		System.out.println((char)iCh);
		
//		char ch2 = -66; //오류 발생. 음수값은 들어갈 수 없음
		
		char hangul = '\uAC00';  //유니코드
		System.out.println(hangul);
	}

}

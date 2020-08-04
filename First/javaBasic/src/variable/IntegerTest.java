package variable;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		byte bs = -129; //Type mismatch: cannot convert from int to byte
		byte bs = -128; //-128 ~ 127까지 가능
		
		System.out.println(bs);
		
//		int ival = 12345678900;  //The literal 12345678900 of type int is out of range 
//		long lval = 12345678900;  //기본적으로 숫자는 int(4비트)에 집어넣으므로 이 숫자는 처리하기 커서 오류가 남
		long lval = 12345678900L;  //L을 뒤에 붙이면 Long으로 취급해라
		
	}

}

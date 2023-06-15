/* 16장. 상속. pdf 파일의 No.32쪽의 9번문제 */
class A2 extends Object{
	public String toString() {
		return "4";
	}
}

class B2 extends A2{

	@Override
	public String toString() {
		return super.toString() + "3";
	} // 메서드 오버라이딩
	

	
}

public class Ex16_9 {
public static void main(String[] args) {
	System.out.println(new B2()); //.toString()이 생략되어있음 =>"43"
}
}

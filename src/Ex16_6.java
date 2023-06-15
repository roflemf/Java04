/* 16장. 상속. pdf 파일의 No.28쪽의 5번문제 */

class TestSuper extends Object{
	int i;
	/* 생성자를 오버로딩하면 기본 생성자는 묵시적 제공하지 않는다.*/
	TestSuper(int i){
		this.i = i;
	}
}

class TestSub extends TestSuper{
	
	TestSub(){
//		super(); // 제공되지 않는 부모클래스 기본생성자를 호출하려다가 에러가 발생
		super(100); // 부모클래스 오버로딩 된 생성자를 호출하면 에러가 발생하지 않음. 항상 첫줄에 코드
	}
	
}


public class Ex16_6 {
public static void main(String[] args) {
	new TestSub();
}
}

/* 16장. 상속. pdf 파일의 No.31쪽의 8번문제 */
class A{
	public A() {
		System.out.println("A() 생성자");
	}
	
}

class B extends A{
	public B() {
		super();//묵시적 생략 가능; 부모의 기본생성자 호출은 생략해도 자바컴파일러가 묵시적 제공.
		System.out.println("B() 생성자");
		//super(); //항상 첫줄에 와야함. 그렇지 않아서 에러 발생
		
	}
}
public class Ex16_8 {
	public static void main(String[] args) {
		A a = new B(); // 업캐스팅 (자손->부모 로 올리는것)
	}

}

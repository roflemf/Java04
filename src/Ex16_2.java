class Parent16{
	private int a;
			int b;
	protected int c;
	public int d;
	
	
//	Q 기본생성자 명시 안해도되는지
	public Parent16(int a) {
		this.a = a;
		System.out.println(a);
	}
	
}

class Child16 extends Parent16{
	public Child16(int a, int b, int c, int d) {
//		this.a = a; //컴파일 에러가 나는 이유는 a 멤버변수는 부모클래스에서 private으로 정의되어서 접근 불가
		/* 생성자도 메서드의 일종이어서 생성자 중괄호 블록{} 내에서 메서드 호출해도 된다. 
		 * 하지만 객체지향 언어(OOP)에서는 많이 하지 않는코드.
		 * 이보다는 생성자{}내에서 super(),this()에 의해  생성자 호출 쪽으로 해결하는 것이 더 합리적.
		 * 
		 */
		super(a);
		
		this.b = b;
		this.c = c;
		this.d = d;
		
	}
	
	void func() {
//		System.out.println(a); // 11줄과 동일 이유로 컴파일 에러
		System.out.println(b); // 상속받아서 출력
		System.out.println(c);
		System.out.println(d);
	}
}
public class Ex16_2 {

	public static void main(String[] args) {
		
		Child16 one = new Child16(1, 2, 3, 4);
		one.func();
		/* 문제) 부모클래스에 private 으로 선언된 a 멤버변수는 수정하지 말고, 
		 *  	추가코드를 통해서 컴파일 에러가 나지 않게 하고 
		 *  	a,b,c,d 멤버변수값을 출력
		 */
		
		

	}

}

/* 레퍼런스간의 형변환)
 *  1. 업캐스팅이란?
 *     상속관계에서 자손타입이 부모 조상타입으로 형변환이 이루어지는 것을 업캐스팅이라고 한다.
 *     업캐스팅은 자바 컴파일러에 의해서 자동 형변환을 해준다.
 */

class Mother11{ // extends Object이 생략됌
	void m11(){
		System.out.println("부모클래스 m11() 메서드");
	}
}

class Child11 extends Mother11{
	void ch11() {
		System.out.println("자손클래스에서 정의된 메서드 ch11()");
	}
}



public class CastingEx11 {
	public static void main(String[] args) {
		Child11 ch = new Child11();
		ch.m11(); //상속받아서 호출
		ch.ch11(); //자손에서 정의된 메서드 호출
		System.out.println("=======================");

		Mother11 m11 = new Child11(); // 참조타입간의 형변환에서 업캐스팅이라고 한다.
		m11.m11();
		Mother11 m12; //부모타입 참조변수 m12 선언
		m12 = ch; // 업캐스팅
		m12.m11();

	}
}

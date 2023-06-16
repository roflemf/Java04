/* 업캐스팅 이후 메서드가 오버라이딩을 한 경우에는 업캐스팅 된 참조변수가 
 * 실제 가리키는 객체 타입에 의해서 호출되는 메서드가 결정됌.
 * 업캐스팅 이후 자손에서 오버라이딩한 메서드를 호출.
 * 
 * 
 */

// 업캐스팅 또는 메서드를 오버라이딩 하려면 사전에 상속관계를 만들어야함
class Mother16{
	void m16() {
		System.out.println("부모클래스 Mother16 m16() 메서드");
	}
}

class Child17 extends Mother16{

	@Override
	void m16() {		
		System.out.println("오버라이딩 한 메서드 m16()");
	}

	void ch16() {
		System.out.println("자손에서 정의된 메서드 ch16()");
	}


}
public class CastingEx16 {
	public static void main(String[] args) {
		Mother16 m = new Mother16();
		m.m16(); //부모의 메서드를 호출

		Mother16 m2 = new Child17(); // 업캐스팅
		m2.m16(); // 오버라이딩한 메서드 호출
		// => m2가 실제 가리키는 객체 타입에 의해서 호출되는 메서드가 결정됌.

		/* 문제 1)
		 * m2를 명시적인 다운캐스팅 한 다음 자손에서 정의한 메서드와 오버라이딩 한 메서드를 각각 호출 */

		/*  
		 * 문제2)
		 *  m2가 사전에 미리 업캐스팅을 한 적이 있는지 애매모호해서 형변환 유무 판단 연산자인 instanceof 을 사용해서 
		 *  명확하게 다운캐스팅을 하려고 한다
		 *  이 코드 추가!
		 */

		if(m2 instanceof Child17) { // m2가 Child17 자손타입으로 명확하게 다운캐스팅이 가능한가? 참
			Child17 ch = (Child17) m2;
			ch.m16(); // 오버라이딩한 메서드 호출
			ch.ch16(); // 자손에서 정의한 메서드 호출
		}else {
			System.out.println("사전에 업캐스팅 안해서 다운캐스팅 불가");
		}
	}
}

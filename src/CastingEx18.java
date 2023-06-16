class Mother18{
	int a = 100;
	 void m18() {
		 System.out.println("부모클래스 매서드 m18()");
	 }
}

class Child18 extends Mother18{
	int a =200;

	@Override
	void m18() {
		System.out.println("오버라이딩한 메서드");
	}
	
	
}
public class CastingEx18 {
public static void main(String[] args) {
	Mother18 m = new Child18(); // 업캐스팅
	m.m18(); //실제 m 이 가리키는 객체 타입에 의해서 호출되는 메서드가 결정. 즉 업캐스팅 이후 오버라이딩 한 메서드
	/* 메서드 오버라이딩이 되면 동일 메서드 원형이 부모에도 있다.
	 * 그러므로 메서드 호출문제가 발생하는데 메서드가 오버라이딩을 한 경우에는 
	 * 업캐스팅한 참조변수 m이 실제 가리키는 객체타입(Child18)에 의해서 호출되는 메서드가 결정된다
	 */
	System.out.println(m.a);
	/* 부모와 자손에서 동일 멤버변수가 정의 되었을때 m 타입에 의해서 호출되는 멤버변수가 결정된다.
	 * 여기에서는 부모타입인 Mother18이 타입이어서 부모에  정의된 동일 멤버변수 a를 호출한다.
	 */
	Child18 ch = (Child18)m; // 명시된 다운캐스팅
	System.out.println(ch.a);// 자손에서 정의된 동일 멤버변수 a를 호출 => 200
}

}

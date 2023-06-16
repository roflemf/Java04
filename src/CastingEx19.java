/* 1. 부모와 자손에서 동일 멤버변수가 정의된 경우에는 부모로부터 상속받은 멤버변수 x에 접근하려면 super.x로 접근하고 ,
 * 	    자손에 의해 정의된 멤버변수 x에 접근하려면 this.x 또는 x로 접근한다.
 * 
 * 2. 메서드가 오버라이딩한 경우에는 부모와 자손에 동일 메서드 원형이 존재한다.
 * 	   그러므로 업캐스팅한 m19가 실제 가리키는 객체 클래스 타입이 자손인 Child19 타입이어서 호출되는 메서드가 
 *    결국 자손에서 
 * 	   그러므로 자손에서 오버라이딩한 메서드가 호출된다.
 */


class Mother19{
	int x =100;
	 void m19() {
		 System.out.println("부모클래스 m19() 메서드");
	 }
}

class Child19 extends Mother19{
	int x = 200;
	
	@Override
	void m19() {
		System.out.println("super.x = "+super.x);
		System.out.println("x="+x+",this.x="+x);
	}
	
}

public class CastingEx19 {
	public static void main(String[] args) {
		Mother19 m19 = new Child19();
		m19.m19(); // 업캐스팅 이후 오버라이딩한 메서드 호출
		System.out.println("m19,x="+m19.x); //부모와 자손에서 동일 멤버변수 x가 정의된 경우에는 m19참조타입에 의해서 호출되는 멤버변수가 결정된다.
											// 여기서는 Mother19 부모타입이니 부모의 x변수를 호출한다.
		
	}
}












//Son01 s01 = new Son01();
//s01.i = 50;
//
//Mother01 m01 = (Mother01) s01;
//m01.i
//
//Son01 s02 = (Son01) m01;
//s02.i
//













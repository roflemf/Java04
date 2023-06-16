/* 업캐스팅, 다운캐스팅을 할 수 있는지 판단하는 연산자가 instanceof 이다. 
 * 주로 if 조건문과 함께 사용한다.
 * 
 * 사용형식)
 * if (참조변수 instanceof 타입){
 *  참조변수가 주어진 타입으로 업캐스팅/다운캐스팅이 가능한가 유무에서 참이면 업캐스팅, 다운캐스팅을 한다.
 * }
 * 결론 instanceof는 업캐스팅/다운캐스팅 유무 판단연산자이다.
 * 즉, 형변환 유무 판단연산자.
 */
class HandPhone15{
	String model; //폰 모델명
	String number; // 폰번호
	
	public HandPhone15() {}
	public HandPhone15(String model, String number) {
		this.model = model;
		this.number = number;
	}//생성자 오버로딩
}//HandPhone 부모클래스

class DicaPhone15 extends HandPhone15{
	String pixel; // 화소수
	public DicaPhone15() {}
	public DicaPhone15(String model, String number, String pixel) {
		super(model, number); // 부모클래스 오버로딩된 생성자를 호출하면서 모델과 번호, 멤버변수 초기화 
							  // => 생성자의 주된 기능
		this.pixel = pixel;
	}
	
	public void prn() {
		System.out.println("폰모델명 : " + model + ", 폰번호 : " + number + ", 화소수 : " + pixel );
		
	}
}// DicaPhone 자손클래스

public class CastingEx15 {
public static void main(String[] args) {
	DicaPhone15 dp = new DicaPhone15("갤럭시 100", "010-9999-9999", "1024");
	dp.prn();
	
	if(dp instanceof HandPhone15) { // dp가 업캐스팅이 가능한가? 참
		System.out.println("업캐스팅이 가능함");
		HandPhone15 hp2 = dp; // 업캐스팅
	}else {
		System.out.println("업캐스팅이 불가능함");
	}
	System.out.println("============================");
	
	HandPhone15 hp = new HandPhone15(); // 사전에 업캐스팅을 안함 -> instanceof연산자를 사용하는 목적
	
	if(hp instanceof DicaPhone15) { // hp 가 다운캐스팅이 가능한가? 거짓
		System.out.println("사전에 업캐스팅을 해서, 다운캐스팅 가능");
		DicaPhone15 dp15 = (DicaPhone15)hp; // 명시적인 다운캐스팅
	}else {
		System.out.println("사전에 업캐스팅을 안해서, 다운캐스팅 불가");
	}//if else  => instanceof 연산자를 잘 사용하면 캐스팅 연산 예외 오류 방지 가능
}
}
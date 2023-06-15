/* No.26 4번문제
 * 
 */


class HandPhone{
	protected String model;
	protected String number;
	
	public HandPhone() {}
	
	public HandPhone(String model, String number) {
		this.model = model;
		this.number = number;
		
	} // 생성자 주된 기능은 클래스 소속의 인스턴스 변수 초기화이다.
	
	public String getModel() {
		return model;
	}
	
	public String getNumber() {
		return number;
	}
} // HandPhone class (부모클래스)

class DicaPhone extends HandPhone {
	
	protected String pixel;
	
	public DicaPhone() {}
	
	public DicaPhone(String model, String number, String pixel) {
		super(model, number); // 부모 핸드폰 클래스의 오버로딩 된 생성자를 호출
		this.pixel = pixel;	
	}
	
	public void prnDicaPhone() {
		System.out.println("모델명 : "+ model);
		System.out.println("번호 : "+ number);
		System.out.println("화소수 : "+ pixel);
		
	}
}


public class Ex16_5 {
	public static void main(String[] args) {
		DicaPhone prn = new DicaPhone("갤럭시", "010", "1024");
		prn.prnDicaPhone();
		
	}
}

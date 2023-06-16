/* 17장. 레퍼런스 형 변환. pdf No.19쪽 2번문제 */
// 상속관계에서 레퍼런스간의 형변환인 업캐스팅/다운캐스팅, instanceof 연산자
class SubClass{ // extends Object
	int i = 3;

}
public class Ex17_01 {
	public static void main(String[] args) {
		Object obj = new SubClass(); // 최고조상 Object타입으로 업캐스팅
		/* 문제)
		 * 형변환 유무 판단연산자 instanceof 를 추가해서 좀 더 나은 자바 문장 만들기
		 * 
		 * 
		 */
		if(obj instanceof SubClass) { // obj 다운캐스팅 가능한가? 참
			SubClass foo = (SubClass) obj; // 명시적인 다운캐스팅
			System.out.println("i=" + foo.i);	
		}

	}
}

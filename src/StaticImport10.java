/* Static import 문을 사용하면 static 멤버인 정적변수나 정적메서드를 호출할 때 해당 클래스명을 생략가능하다.
 * 해당클래스명을 생략 가능하게 하는 static import 뿐이다.
 * 
 */

import static java.lang.System.out;
import static java.lang.Math.*;
public class StaticImport10 {
public static void main(String[] args) {
	out.println(PI); // System.과 Math.을 생략함.
	out.println(random()); // random() 정적메서드를 호출할 때 해당 클래스명 생략
}
}

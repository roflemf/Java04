/* instanceof 업캐스팅/다운캐스팅 형변환 유무 판단 연산자*/

class Car extends Object{
	
}
class FireCar extends Car{
	
}
public class CastingEx17 {
	public static void main(String[] args) {
	FireCar fc = new FireCar();
	
	if(fc instanceof Car) {//fc Car 타입으로 업캐스팅이 가능한가?
		System.out.println("업캐스팅이 가능하다");
		Car c = fc; // 업캐스팅
	}
	if(fc instanceof Object) {//fc가 바로 부모인 Car을 건너뛰고 최고 조상 Object타입으로 업캐스팅이 가능한가?
		System.out.println("Object 타입으로 업캐스팅이 가능하다");
		Object obj = fc; // 업캐스팅
	}
	Object obj2 = new FireCar(); //최고 조상 타입으로 업캐스팅
	if(obj2 instanceof FireCar) { // 다운캐스팅이 가능한가?
		System.out.println("다운캐스팅이 가능하다");
		FireCar fc2 = (FireCar) obj2; // 명시적인 다운캐스팅
	}
	}

}

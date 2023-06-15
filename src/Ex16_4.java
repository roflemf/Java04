/* 16장. 상속. pdf 파일의 No. 23,24,25쪽의 3번문제 
 * 3. 동물(Animal)과 개(Dog)와 사람(Human)이란 클래스를 서
	로 상속이란 개념을 도입해서 설계해 보도록 합시다. 
	슈퍼 클래스로는 동물(Animal)을 두고, 슈퍼 클래스에는 멤버변수로
	는 어떤 종인지의 구분을 위해서 kind와 
	다리의 개수를 저장하기 위한 leg를 둡니다. 
	또한 슈퍼 클래스의 멤버함수로는 getKind와 walk를 둡니다. 
	getKind 메서드는 어떤 동물인지를 알려주는 메서드이고 
	walk 메서드로 어떻게 걷는지를 알려주는 메서드입니다. 
	Animal에서 생성자 오버로딩을 하시고,
	각 메서드에서 If~else분기문을 사용하세요. 
	각 자식클래스에서 생성자 오버로딩을 하시고 
	super();로 부모클래스 오버로딩 된 생성자를 호출하면 됩니다.
	슈퍼 클래스 상속 관계로 개(Dog)와 사람(Human) 클래스를
	설계해봅시다. (Ex16_04.java) 
 * 
 */
class Animal{
	
	protected String kind;  // 동물 종
	protected int leg;  // 다리개수
	
	public Animal() {}
	
	public Animal(String kind, int leg) {
		this.kind = kind;
		this.leg = leg;
		
	}//생성자 오버로딩
	
	public void getKind() {
		if(kind.equals("강아지")) { //equals()메서드는 문자열 내용만 같으면 참
			System.out.println(kind +"는 동물이다");
		}else {
			System.out.println(kind + "는 사람이다");
			
		}
	}
	
	public void walk() {
		if(leg == 4) {
			System.out.println("강아지는 " + leg + " 발로 걷는다");
		}else {
			System.out.println("사람은 "+ leg + " 발로 걷는다");
		}//if else
	}//walk()
	

}


//첫번째 자손 Human class
class Human extends Animal{
	
	public Human() {
		
	}
	public Human(String kind, int leg) {
		super(kind, leg); // 부모 Animal 클래스의 오버로딩 된 생성자를 호출
	}
	
}

// 두번쨰 자손 Dog class
class Dog extends Animal{
	public Dog() {}
	public Dog(String kind, int leg) {
		super(kind,leg);
	}
}
public class Ex16_4 {
	public static void main(String[] args) {
		
		Dog d = new Dog("강아지", 4);
		Human h = new Human("소녀", 2);
		
		d.getKind();
		d.walk();
		
	}
}

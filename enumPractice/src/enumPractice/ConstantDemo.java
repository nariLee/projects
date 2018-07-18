package enumPractice;

//class Fruit{
//	public static final Fruit APPLE = new Fruit();
//	public static final Fruit PEACH = new Fruit();
//	public static final Fruit BANANA = new Fruit();
//}

enum Fruit{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	public String getColor() {
		return this.color;
	}
	
	Fruit(String color) {
		this.color = color;
		System.out.println("Call Constructor "+this);
		
	}
}

enum Company{
	GOOGLE, APPLE, ORACLE
}


//class Company{
//	public static final Company GOOGLE = new Company();
//	public static final Company APPLE = new Company();
//	public static final Company ORACLE = new Company();
//}

public class ConstantDemo {
	public static void main(String[] args) {
		
		Fruit type = Fruit.APPLE;
		switch(type) {
		case APPLE:
			System.out.println(57+"kcal "+Fruit.APPLE.getColor());
			break;
		case PEACH:
			System.out.println(34+"kcal "+Fruit.PEACH.getColor());
			break;
		case BANANA:
			System.out.println(93+"kcal "+Fruit.BANANA.getColor());
			break;
		}
		
		
		for(Fruit f : Fruit.values()) {
			System.out.println(f);
		}
	}
}

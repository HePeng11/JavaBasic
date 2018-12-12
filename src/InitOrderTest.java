
class HelloA {

	public HelloA() {
		System.out.println("HelloA");//4
	}

	{
		System.out.println("I'm A class");//3
	}

	static {
		System.out.println("static A");//1
	}

}

/**
 * 父类和子类的静态代码块、父类的构造函数块、父类的构造函数
 * @author hepeng
 *
 */
public class InitOrderTest extends HelloA {
	public InitOrderTest() {
		System.out.println("HelloB");//6
	}

	{
		System.out.println("I'm B class");//5
	}

	static {
		System.out.println("static B");//2
	}

	public static void main(String[] args) {
		new InitOrderTest();
	}

}

public class ValueTypeTest {

	String str = new String("good");

	char[] ch = { 'a', 'b', 'c' };

	public static void main(String args[]) {

		ValueTypeTest ex = new ValueTypeTest();
		System.out.println(ex);
		/**
		 * 传入时候，赋值一个新的str的栈内存地址（改地址存的值还是原堆地址），
		 */
		ex.change(ex.str, ex.ch);

		System.out.print(ex.str + " and ");

		System.out.print(ex.ch);

	}

	public void change(String str, char ch[]) {
		System.out.println(str);
		System.out.println(this);
		str = "test ok";
		System.out.println(str);
		System.out.println(2<<3);
		ch[0] = 'g';

	}
}
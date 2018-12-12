import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {

		List<Integer> linkedList = new LinkedList<Integer>();
		long startTime = System.currentTimeMillis(); //System.nanoTime();//当前纳秒时间1秒(s)=1000 000 000纳秒(ns)=1000 000微秒=1000毫秒秒
		for (int i = 0; i < 10000000; i++) {
			linkedList.add(new Integer(i));
		}
		long endTime = System.currentTimeMillis();
		System.out.println("LinkedList:" + (endTime - startTime));//6秒

		startTime = System.currentTimeMillis();
		List<Integer> aryList = new ArrayList<Integer>();
		for (int i = 0; i < 10000000; i++) {
			aryList.add(new Integer(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("ArrayList:" + (endTime - startTime));//2秒
		
		
		
	}
}

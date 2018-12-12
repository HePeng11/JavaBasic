import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList查询快，插入快  是因为底层是由数组实现，通过下标定位数据快。写数据慢是因为复制数组耗时。
 * LinkedList 插入快，查询慢  底层是双向链表，查询数据依次遍历慢。写数据只需修改指针引用。
 * ayList和LinkedList都不是线程安全的，小并发量的情况下可以使用Vector，
 * 若并发量很多，且读多写少可以考虑使用CopyOnWriteArrayList。
 * 因为CopyOnWriteArrayList底层使用ReentrantLock锁，比使用synchronized关键字的Vector能更好的处理锁竞争的问题。
 * 线程安全定义：利于同步机制保证各个线程都可以正常且正确的执行，不会出现数据污染等意外情况 
 * 线程安全问题都是由全局变量及静态变量引起的
 * @author hepeng
 *
 */
public class ListTest1 {
	public static void main(String[] args) {

		List<Integer> linkedList = new LinkedList<Integer>();
		long startTime = System.currentTimeMillis(); //System.nanoTime();//当前纳秒时间1秒(s)=1000 000 000纳秒(ns)=1000 000微秒=1000毫秒秒
		for (int i = 0; i < 10000000; i++) {
			if (i<3) {
				linkedList.add(i, new Integer(i));
			}
			else {
				linkedList.add(3, new Integer(i));
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("LinkedList:" + (endTime - startTime));//6秒

		startTime = System.currentTimeMillis();
		List<Integer> aryList = new ArrayList<Integer>();
		for (int i = 0; i < 10000000; i++) {
			if (i<3) {
				aryList.add(i, new Integer(i));
			}
			else {
				aryList.add(3, new Integer(i));
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("ArrayList:" + (endTime - startTime));//2秒
		
		
		
	}
}

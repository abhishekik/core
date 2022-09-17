package collectionframework;

//import java.util.ArrayDeque;
import java.util.LinkedList;
//import java.util.Deque;
  import java.util.PriorityQueue;
  import java.util.Queue;

public class TestQeue {
	public static void main(String[] args) {
		
		
		Queue  q = new PriorityQueue();
		
		q.add("one");
		q.add("two");
		q.add("three");
		q.add("four");
		q.addAll(q);
		System.err.println(q);
		
		//System.err.println(q.remove("one"));
		//System.err.println(q.remove("one"));
		//System.err.println(q.removeAll(q));
		System.err.println(q.element());
		System.err.println(q.element());
		
		Queue o = new LinkedList<>();
		
		o.add(3);
		o.add(32);
		o.add(14);
		o.add("shiv");
		
		
		o.addAll(q);
		
		
		
		System.err.println(o);
		System.err.println(o.peek());//exit only first value or 0 index(peek)
        System.err.println(o.poll());//exit one by one (poll)
        System.err.println(o.poll());
        System.err.println(o.poll());
		System.err.println(o.remove());
		System.err.println(o.remove(q));
		System.err.println(o.retainAll(o));
		
	}

}

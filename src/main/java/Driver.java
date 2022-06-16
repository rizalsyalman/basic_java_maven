import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment(0);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement(1);
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}

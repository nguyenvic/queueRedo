
public class Driver {

	public static void main(String[] args) {
		Queue<Integer> queue1 = new Queue<>();
		
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(5);

		
		System.out.printf("%n1=====%n");
		queue1.print();

		System.out.printf("%n2=====%n");
		queue1.dequeue();
		queue1.print();
		
		
		System.out.printf("%n3=====%n");
		queue1.dequeue();
		queue1.print();

		System.out.printf("%n4=====%n");
		queue1.dequeue();
		queue1.print();
		
		System.out.printf("%n5=====%n");
		queue1.dequeue();
		queue1.print();
		
		System.out.printf("%n6=====%n");
		queue1.dequeue();
		queue1.print();

	}

}

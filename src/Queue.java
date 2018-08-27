//Queue with generic. didnt complete because just for refresher
public class Queue<E> {
	private static class Node<E>
	{
		private E data;
		private Node<E> link;
		
		Node(E data)
		{
			this.data = data;
			this.link = null;
		}
		
	}
	
	Node<E> front;
	Node<E> back;
	int size;
	
	
	public Queue()
	{
		front = null;
		back = null;
		size = 0;
	}
	
	public void enqueue(E data)
	{
		if (size == 0)
		{
			front = back = new Node<E>(data);
		}
		else
		{
			back.link = new Node<E>(data);
			back = back.link;
		}
		size++;
	}
	
	public void dequeue()
	{
		if (size == 1)
		{
			front = null;
			back = null;
			size--;
		}
		else if (size > 1)
		{
			Node<E> tempNode = front;
			front = front.link;
			tempNode = null;
			size--;
		}
		else
		{
			System.out.printf("The queue is empty!");
		}
	}

	public void print()
	{
		Node<E> tempNode = front;
		while (tempNode!= null)
		{
			System.out.println(tempNode.data);
			System.out.println("");
			tempNode = tempNode.link;
		}
	}
}

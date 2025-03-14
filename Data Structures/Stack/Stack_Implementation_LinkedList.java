
public class Stack_Implementation_LinkedList {

	public static void main(String... args) {
		Stack<String> stack = new Stack<>();
		stack.push("This");
		stack.push("is");
		stack.push("Sparta");
		stack.push("part 2");
		
		System.out.println(stack.toString());
		
		stack.pop();
		System.out.println(stack.toString());
		

	}

}

class Stack<T> {

	Node<T> node;
	int size = 0;
	Node<T> head;

	Stack() {
		node = new Node<T>();

	}

	public T push(T value) {
		if (head == null) {
			node = new Node<T>(value);
			head = node;
			return (T) node.data;
		}

		while (node.next != null) {
			node = node.next;
		}

		node.next = new Node<T>(value);
		size++;
		return (T) node.next.data;
	}

	public T pop() {
		if (node == null)
			return null;

		Node<T> head = node;
		while (head.next.next != null) {
			head = head.next;
		}
		Node<T> result = head.next;
		head.next = null;
		size--;

		return (T) result.data;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[ ");
		Node<T> k = head;
		while(k != null) {
			str.append(k.data + " ");
			k = k.next;
		}
		str.append("]");
		return str.toString();
	}

}

class Node<T> {
	T data;
	Node<T> next;

	Node(T value) {
		data = value;
		next = null;
	}

	Node() {
	};

}

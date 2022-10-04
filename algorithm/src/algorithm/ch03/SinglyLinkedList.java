package algorithm.ch03;

public class SinglyLinkedList {
	private Node head;

	SinglyLinkedList() {
		this.head = null;
	}

	SinglyLinkedList(int value) {
		this.head = new Node(value, null);
	}

	class Node {
		private int value;
		private Node next;

		Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		public int getValue() {
			return this.value;
		}

		public Node getNext() {
			return this.next;
		}

	}

	public Node getHead() {
		return this.head;
	}

	public void append(int value) {

		// head가 null이면 첫번째 노드
		if (this.head == null) {
			this.head = new Node(value, null);
			return;
		}

		// 첫번째 노드가 있으면 첫번쨰노드는 pointer가 가리키게되며 next가 null값이 나올때까지 반복
		// null이나오면
		Node pointer = this.head;
		while (pointer.next != null) {
			pointer = pointer.next;
		}

		// 마지막 노드이기때문에 새로운노드 생성후
		pointer.next = new Node(value, null);

	}

	public void PrintAll() {
		Node pointer = this.head;
		StringBuilder builder = new StringBuilder();
		while (pointer.next != null) {
			builder.append(pointer.getValue());
			builder.append("->");
			pointer = pointer.next;
		}

		builder.append(pointer.getValue());
		System.out.println(builder.toString());
	}

	public static void main(String[] ag) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.append(10);
		sl.append(20);
		sl.append(30);
		sl.append(40);
		sl.append(50);
		sl.PrintAll();

	}

}

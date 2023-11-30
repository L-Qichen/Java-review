
public class LinkedList {
	private int length;
	private Node head;
	private Node tail;
	
	public LinkedList() {
		this.length = 0;
		this.head = null;
		this.tail = null;
	}
	
	public void add(Node node) {
		if(length == 0) {
			head = new Node(node.value);
			tail = head;
		} else {
			Node temp = new Node(node.value);
			Node last = tail;
			last.next = temp;
			tail = temp;
		}
		length++;
	}
	
	public void add(int index, Node node) {
		if(index < 0 || index >= length) {
			return;
		} else if(head == null){
			add(node);
		}else {
			if(index == 0) {
				Node temp = new Node(node.value);
				temp.next = head;
				head = temp;
			} else {
				Node prev = null;
				Node curr = head;
				for(int i = 0; i < index; i++) {
					prev = curr;
					curr = curr.next;
				}
				Node temp = new Node(node.value);
				temp.next = curr;
				prev.next = temp;
			}
			length++;
		}
	}
	
	public void remove(int index) {
		if(index < 0 || index >= length) {
			return;
		} 
		if(index == 0){
			head = head.next;
			if(head == null) {
				tail=null;
			}
		}else {
			Node pre = null;
			Node curr = head;
			for(int i = 0; i < index; i++) {
				pre = curr;
				curr = curr.next;
			}
			pre.next = curr.next;
			if(curr == tail) {
				System.out.println("1");
				tail = pre;
			}
			length--;
		}
	}
	
	public int find(int index) {
		if(index < 0 || index >= length) {
			return -1;
		} 
		if(index == 0){
			return head.value;
		} else {
			Node curr = head;
			for(int i=0; i < index; i++) {
				curr = curr.next;
			}
			return curr.value;
		}
	}

	@Override
	public String toString() {
		String result = "";
		Node curr = head;
		for(int i=0; i < length; i++) {
			if(curr != null) {
				result = result + curr.value+" ";
				curr = curr.next;
			}
		}
		return "LinkedList [length=" + length + ", head=" + head.value + ", tail=" + tail.value + "]"
				+ "\n" + result;
	}

}

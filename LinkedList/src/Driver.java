
public class Driver {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		Node a = new Node(12);
		Node b = new Node(3);
		Node c = new Node(5);
		ll.add(a);
		ll.add(b);
		ll.add(0,c);
		ll.add(2,a);
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		ll.add(b);
		System.out.println(ll);
		System.out.println(ll.find(2));
	}

}

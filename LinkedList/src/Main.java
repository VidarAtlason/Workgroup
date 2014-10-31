
public class Main {

	public static void main(String[] args) throws Exception
	{
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(7);
		ll.add(3);
		ll.addAt(4,3);
		System.out.println(ll+ " Length: "+ll.length);
		System.out.println(ll.indexOf(6));
	}
}

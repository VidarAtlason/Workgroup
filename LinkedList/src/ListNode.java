
public class ListNode {

	public ListNode next;
	public int data;
	public ListNode(){
		this.next = null;
		this.data = 0;
	}
	public ListNode(int data){
		this.next = null;
		this.data = data;
	}
	public ListNode(int data, ListNode next){
		this.next = next;
		this.data = data;
	}
	
}

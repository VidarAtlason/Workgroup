
public class LinkedList {
	private ListNode root;
	int length;
	public LinkedList(){
		root= null;
		length = 0;
	}
	public LinkedList(int data)
	{
		root = new ListNode(data);
		length = 1;
	}
	public LinkedList(ListNode node)
	{
		root = node;
		length = 1;
	}
	public void add(int data)
	{
		if (root == null)
		{
			root = new ListNode(data);
			length++;
		}
		else 
		{
			ListNode node= root;
			while (node.next != null)
				node = node.next;
			node.next = new ListNode(data);
			length++;
		}
	}
	public void addAt(int data,int index) throws Exception
	{
		if (index>length)
			throw new Exception("Out of Bounds");
		else if (index==0)
			root = new ListNode(data,root);
		else 
		{
			int tempIndex = 1;
			ListNode node = root;
			while(tempIndex != index)
			{
				node = node.next;
				tempIndex++;
			}
			ListNode newNode = new ListNode(data,node.next);
			node.next = newNode;
			
		}
		length++;
	}
	public void remove(int data)
	{
		if (root == null)
			return;
		if (root.data == data)
		{
			root = root.next;
			length--;
			return;
		}
		ListNode temp = root;
		while (temp.next!= null)
		{
			if (temp.next.data == data)
			{
				temp.next = temp.next.next;
				length--;
			}
			else temp = temp.next;
		}
	}
	public void removeAt(int index) throws Exception
	{
		if (index>this.length-1)
			throw new Exception("Out of Bounds");
		else if (index==0)
		{
			root=root.next;
			length--;
		}
		else 
		{
			int tempIndex = 0;
			ListNode temp = root;
			while (++tempIndex!=index)
			{
				temp=temp.next;
			}
			temp.next = temp.next.next;
			length--;
		}
	}
	public int indexOf(int value)
	{
		if (root== null) return -1;
		else 
		{
			ListNode temp = root;
			int index = 0;
			while (temp != null)
			{
				if (temp.data == value) return index;
				else 
				{
					index++;
					temp = temp.next;
				}
			}
			
		}
		return -1;
	}
	public String toString() {
		if (root == null)
			return "[]";
		else
		{
			String ret = "[";
			ListNode temp = root;
			while (temp!=null)
			{
				ret+= temp.data;
				if (temp.next != null) ret+= ", ";
				temp = temp.next;
			}
			ret+= "]";
			return ret;
		}
		
	}

}

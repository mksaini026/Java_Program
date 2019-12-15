package linkedList;

public class LinkedListAdd3Data extends LinkedList 
{
	@Override
	public void add()
	{
		Node n1 = new Node(5);
		Node n2 = new Node(11);
		Node n3 = new Node(25);
		
		headNode = n1;		
		n1.nextRef = n2;		
		n2.nextRef = n3;
	}
	
	public void asas()
	{
		
	}
	
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedListAdd3Data();
		ll.print();
		ll.add();
		ll.print();	
		ll.add(3);
		ll.print();	
		ll.add(30);
		ll.print();
		int isRemoved = ll.remove(30);
		System.out.println(isRemoved);
		ll.print();
		
		((LinkedListAdd3Data)ll).asas();
	}

	@Override
	public void add(int data) 
	{
		Node n = new Node(data);
		if(headNode == null)
		{
			headNode = n;
		}
		else if(headNode.nextRef == null || headNode.data > data)
		{
			if(headNode.data > data)
			{
				n.nextRef = headNode;
				headNode = n;
			}
			else
			{
				headNode.nextRef = n;   
			}
		}
		else
		{
			Node temp = headNode;			
			while(temp.nextRef != null && temp.nextRef.data < data)
			{				
				temp = temp.nextRef;
			}
			n.nextRef = temp.nextRef;  
			temp.nextRef = n;
		}
		
	}
	
	@Override
	public int remove(int data) 
	{
		if(headNode == null)
		{
			System.out.println("List is Empty");
			return 0;
		}
		else if(headNode.nextRef == null)
		{
			if(headNode.data == data)
			{
				headNode = null;
				return 1;
			}			
			return 0;
		}
		else if(headNode.data == data)
		{
			headNode = headNode.nextRef;
			return 1;
		}
		else
		{
			Node temp = headNode;
			while(temp.nextRef != null && temp.nextRef.data != data)
			{
				temp = temp.nextRef;
			}
			if(temp.nextRef.data == data)
			{
				temp.nextRef = temp.nextRef.nextRef;
				return 1;
			}
			return 0;
		}
		
	}

	@Override
	public void insertionSinglyLinkedListNodeAtBeginning() {

	}

	@Override
	public void deletionSinglyLinkedListNodeAtBeginning() {

	}

	@Override
	public void deletionSinglyLinkedListNodeAtLast() {

	}

	@Override
	public int SinglyLinkedListLength() {
		return 0;
	}

	@Override
	public void SinglyLinkedListIndexedData(int index) {

	}

	//	@Override
	public void insertionSinglyLinkedListAtBeginning() {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void deletionSinglyLinkedListAtBeginning() {
		// TODO Auto-generated method stub
		
	}
	

}

package linkedList;

public abstract class LinkedList 
{
	Node headNode;	
	public abstract void add();
	public abstract void add(int count);
	public abstract int remove(int data);
	public abstract void insertionSinglyLinkedListNodeAtBeginning();
	public abstract void deletionSinglyLinkedListNodeAtBeginning();
	public abstract void deletionSinglyLinkedListNodeAtLast();
	public abstract int SinglyLinkedListLength();
	public abstract void SinglyLinkedListIndexedData(int index);
	

	void print()
	{
		if(headNode == null)
			System.out.println("LinkedList is Empty");
		
		Node temp = headNode;
		while(temp != null)
		{
			System.out.println(temp + " " +  temp.data + " " + temp.nextRef);
			temp = temp.nextRef;
		}
		System.out.println();
	}
	

}

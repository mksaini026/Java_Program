package linkedList;

import java.util.Scanner;

public class LinkedListAddAnyNumberOfData extends LinkedList
{
	static Scanner sc = new Scanner(System.in);
	public void add()
	{
		char canContinue;
		do
		{			
			System.out.println("Enter Data : ");
			int data = sc.nextInt();
			Node n = new Node(data);
			if(headNode == null)
			{
				headNode = n;
			}
			else
			{
				Node temp = headNode;
				while(temp.nextRef != null)
				{		
					temp = temp.nextRef;
				}				
				temp.nextRef = n;
			}				
			System.out.println("Shall we continue : ");
			canContinue = sc.next().charAt(0);			
		}while(canContinue == 'y');
	}
	
	public void add(int count)
	{
		System.out.println("Enter Data : ");
		for(int i = 0; i < count; i++)
		{
			int data = sc.nextInt();
			Node n = new Node(data);
			if(headNode == null)
			{
				headNode = n;
			}
			else
			{
				Node temp = headNode;
				while(temp.nextRef != null)
				{		
					temp = temp.nextRef;
				}				
				temp.nextRef = n;
			}						
		}
	}
	
	public void insertionSinglyLinkedListNodeAtBeginning()
	{
		System.out.println("Enter Insertion Data : ");
		int data = sc.nextInt();
		Node n = new Node(data);
		if(headNode == null)
		{
			headNode = n;
		}
		else
		{
			Node temp = headNode;
			headNode = n;
			n.nextRef = temp;
		}
	}
	
	public void deletionSinglyLinkedListNodeAtBeginning()
	{
		if(headNode == null)
		{
			System.out.println("There is no Data to Delete");
		}
		else
		{
			headNode = headNode.nextRef;
			System.out.println("Beginning Node Data has been Deleted");
		}
	}
	
	public void deletionSinglyLinkedListNodeAtLast()
	{
		if(headNode == null)
		{
			System.out.println("There is no Data to Delete");
		}
		else if(headNode.nextRef == null)
		{
			headNode = null;
			System.out.println("Only one data was there. Now list is empty");			
		}
		else
		{
			Node temp = headNode;			
			while(temp.nextRef.nextRef != null)
			{					
				temp = temp.nextRef;
			}				
			temp.nextRef = null;
			System.out.println("Last Node Data has been Deleted");
		}
	}
	
	public int SinglyLinkedListLength()
	{
		int length = 0;
		if(headNode == null)
		{
			System.out.println("Empty LinkedList so No Length");
		}
		else
		{
			Node temp = headNode;
			while(temp != null)
			{	
				length++;
				temp = temp.nextRef;
			}
			System.out.println("Linked List Length is : "+ (length));
		}
		return length;
	}
	
	public void SinglyLinkedListIndexedData(int index)
	{
		Node temp = headNode;
		boolean isFound = false;
		for(int i=0; i<=index && temp != null; i++)
		{
			if(i == index)
			{
				System.out.println("At Index number: "+index+" -> "+temp+ " " +temp.data+" "+temp.nextRef);
				isFound=true;
			}
			temp = temp.nextRef;
		}
		
		if(!isFound)
		{
			System.out.println("Given Index Number is out of Linked List Length");
		}
	}
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedListAddAnyNumberOfData();
		System.out.println("Number of data");
		int count = sc.nextInt();
		ll.add(count);
		ll.print();
		ll.deletionSinglyLinkedListNodeAtLast();
		ll.print();
		ll.SinglyLinkedListLength();
		//System.out.println(ll.headNode);
		ll.insertionSinglyLinkedListNodeAtBeginning();
		ll.print();
		ll.SinglyLinkedListLength();
		ll.deletionSinglyLinkedListNodeAtBeginning();
		ll.print();
		ll.SinglyLinkedListLength();
		//System.out.println(ll.headNode);
		ll.deletionSinglyLinkedListNodeAtLast();
		ll.print();
		ll.SinglyLinkedListLength();
		ll.SinglyLinkedListIndexedData(3);
	}

	@Override
	public int remove(int data) 
	{

		return 0;
	}
	
}

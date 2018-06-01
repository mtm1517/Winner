package Winner;
import java.util.*;


/*
 * Create a LinkedList
 */
public class CurLinkedList {
	public NumNode head;
	public NumNode tail;

	// Create a Linked List
	public CurLinkedList()
	{}
	
	// Insert a Node at Head of LinkedList
	public void insertAtHead(int number)
	{
		NumNode node = new NumNode(number);
		node.setNext(head);
		head = node;
		if(tail==null)
			tail = node;	
	}
	
	// Add content of array to LinkedList
	public CurLinkedList(int number)
	{
		for(int i=number;i>0;i--)
			insertAtHead(i);
	}
	
	// Delete a Node in Linked list
	public NumNode deleteLinkedList(NumNode node)
	{
		node = node.getNext().getNext();
		return node;
	}
	
	// Print out a Linked List after delete
	public String LinkedList(int k)
	{
		NumNode node = head;
		int i=0;
		String str ="";
		while(node!=null)
		{
			str += node.getData();
			if(i==k-1)
			{
				node = deleteLinkedList(node);
				i=-1;
			}	
			else
				node = node.getNext();
			i++;
			
		}
		return str;
	}
	
	

	
	// Print out linkedList
	public String toString()
	{
		String s="";
		NumNode node = head;
		while(node!=null)
		{
			s += node.getData();
			node = node.getNext();
		}
		return s;
	}
	
	public int sizeLinkedList()
	{
		int size=0;
		
		if(isEmpty())
			return size;
		else 
		{
			NumNode node = head;
			while(node!=null)
			{
				node = node.getNext();
				size++;
			}
		}
		return size;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	// Main program
	public static void main(String[] args)
	{
		int numberList = 7; // create array
		CurLinkedList list = new CurLinkedList(numberList); // create a linkedlist
		System.out.println(list.toString()); // print out a linkedlist after add content of array to linkedlist
		//int winner = list.Winner(list.head, 2);
		//System.out.println(winner); 
		//System.out.println(list.LinkedList(2)); // print out a linkedlist after delete a Node
		
	}
	
	
}

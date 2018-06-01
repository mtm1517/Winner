package Winner;
/* 
 * MyVu - 011950276
 * CS146
 * Project 1A
 * March 9, 2018
 */

/*
 * Create a class NumNode
 */
public class NumNode {
	private int num;   // data Node
	private NumNode next;  // next Node
	
	// create a Node
	NumNode(int num)
	{
		this.num = num;
	}
	
	// GetNet Node
	NumNode getNext()
	{
		return next;
	}
	
	// SetNext Node
	void setNext(NumNode next)
	{
		this.next=next;
	}
	
	// GetDate Node
	int getData()
	{
		return num;
	}
}

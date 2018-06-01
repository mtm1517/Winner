package Winner;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void LinkedListtest() {
		CurLinkedList prisoners = new CurLinkedList(); // Create a linked list
		assertTrue(prisoners.isEmpty());  // check linked list is empty before inserting element
		assertEquals(0,prisoners.sizeLinkedList());  // check size of linked list = 0 before inserting an element.
		prisoners.insertAtHead(5);                  // insert element = 5 to linked list
		assertFalse(prisoners.isEmpty());          // check linked list isn't empty after inserting; 
		assertEquals(1,prisoners.sizeLinkedList());
	}

}

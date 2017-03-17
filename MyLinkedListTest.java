import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void createSingleNode() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.add(1);
		assertEquals(1, (int)list.get(0));
	}

	public void createAFewNodes() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		assertEquals(10, (int)list.size());
	}

	public void contains() {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.add(1);
		assertTrue(list.contains(1));
	}

}

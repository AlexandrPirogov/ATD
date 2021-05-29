package ATDStack;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoundetStackTest {

	@Test
	public void test() {
		BoundedStackATD<Integer> stack = new BoundedStackATD<Integer>();
		stack.push(1);
		assertTrue(stack.get_push_status() == 1);
		stack.peek();
		assertTrue(stack.get_peek_status() == 1);
		stack.pop();
		assertTrue(stack.get_pop_status() == 1);
		stack.peek();
		assertTrue(stack.get_peek_status() == 2);
		for(int i = 0; i < 32; i++)
			stack.push(i);
		assertTrue(stack.get_push_status() == 1);
		stack.push(3);
		assertTrue(stack.get_push_status() == 2);
	}
}

package stack;

import java.util.Vector;

abstract class Stack {
	int stk[] = new int[5];
	int top;

	abstract public int pop() throws StackEmptyException;

	abstract public int push(int ele) throws StackFullException;

	abstract public Vector<Integer> display();

	Stack() {
		top = -1;
	}

}

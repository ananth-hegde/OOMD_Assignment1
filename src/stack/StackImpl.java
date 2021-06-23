package stack;

import java.util.Vector;

public class StackImpl extends Stack {

	@Override
	public int pop() throws StackEmptyException {
		if (this.top == -1) {
			throw new StackEmptyException();
		}
		return this.stk[this.top--];
	}

	@Override
	public int push(int ele) throws StackFullException {
		if (this.top == 4) {
			throw new StackFullException();
		}
		this.stk[++(this.top)] = ele;
		return top;
	}

	@Override
	public Vector<Integer> display() {
		Vector<Integer> arr = new Vector<>(0);
		for (int i = 0; i <= top; ++i) {
			arr.add(this.stk[i]);
		}
		return arr;
	}

	public StackImpl() {
		super();
	}

}

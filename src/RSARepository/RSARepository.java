package RSARepository;

import java.util.Vector;

import stack.StackEmptyException;
import stack.StackFullException;
import stack.StackImpl;

public class RSARepository {

	public StackImpl myStack = new StackImpl();

	public Integer store(int x) {
		try {
			myStack.push(x);
			return 1;
		} catch (StackFullException e) {
			return 2;
		} catch (Exception e) {
			return 0;
		}
	}

	public String retrieve() {
		try {
			int x = myStack.pop();

			return Integer.toString(x) + "#Successful";

		} catch (StackEmptyException e) {
			return "# Repository Empty";
		} catch (Exception e) {
			return "# Failure for Unknown Reason";
		}
	}

	public Vector<Integer> display() {
		return myStack.display();
	}
}

package RSARepository;

import java.util.Vector;

public class RSARepositoryTest {

	public static void main(String[] args) {
		RSARepository repo = new RSARepository();
		Vector<Integer> returnedArray = new Vector<Integer>(0);
		String returnedString = new String();
		int returnedInt;
		// Call test 1 - stack empty call display
		returnedArray = repo.display();
		if (returnedArray.isEmpty()) {
			System.out.println("Testcase-1 Successful. State = empty, Service = display ()");
		} else {
			System.out.println("Testcase-1 Fails. State = empty, Service = display ()");
		}

		// Call test 2 - Stack empty call retrieve
		returnedString = repo.retrieve();
		if (returnedString == "# Repository Empty") {
			System.out.println("Testcase-2 Successful. State = empty, Service = retrieve ()");
		} else {
			System.out.println("Testcase-2 Fails. State = empty, Service = retrieve ()");
		}

		// Call test 3 - Stack empty call store
		returnedInt = repo.store(4);
		if (returnedInt == 1) {
			System.out.println("Testcase-3 Successful. State = empty, Service = store ()");
		} else {
			System.out.println("Testcase-3 Fails. State = empty, Service = store ()");
		}

		// Call Test 4 - Stack NENF call display
		returnedArray = repo.display();
		if (returnedArray.isEmpty()) {
			System.out.println("Testcase-4 Fails. State = NENF, Service = display()");
		} else {
			System.out.println("Testcase-4 Successful. State = NENF, Service = display()");
		}

		// Call Test 5 - Stack NENF call retrieve
		returnedString = repo.retrieve();
		if (returnedString == "# Repository Empty" || returnedString == "# Failure for Unknown Reason") {
			System.out.println("Testcase-5 Fails. State = empty, Service = retrieve ()");
		} else {
			System.out.println("Testcase-5 Successful. State = empty, Service = retrieve ()");
		}

		// Call Test 6 - Stack NENF call store
		// make stack NENF first
		repo.store(0);
		repo.store(1);
		returnedInt = repo.store(4);
		if (returnedInt == 1) {
			System.out.println("Testcase-6 Successful. State = empty, Service = store ()");
		} else {
			System.out.println("Testcase-6 Fails. State = empty, Service = store ()");
		}

		// Make stack full for test cases 7,8 and 9
		int i = 0;
		// Keep pushing till stack full
		while ((returnedInt = repo.store(i++)) != 2)
			;

		// Call Test 7 - Stack Full call display

		returnedArray = repo.display();
		if (returnedArray.size() != 5) {
			System.out.println("Testcase-7 Fails. State = Full, Service = display()");
		} else {
			System.out.println("Testcase-7 Successful. State = Full, Service = display()");
		}

		// Call Test 8 - Stack full call retrieve
		returnedString = repo.retrieve();
		if (returnedString == "# Repository Empty" || returnedString == "# Failure for Unknown Reason") {
			System.out.println("Testcase-8 Fails. State = empty, Service = retrieve ()");
		} else {
			System.out.println("Testcase-8 Successful. State = empty, Service = retrieve ()");
		}

		// Make repo full again, since we popped once
		repo.store(10);

		// Call Test 9 - Stack full call store
		returnedInt = repo.store(4);
		if (returnedInt == 2) {
			System.out.println("Testcase-9 Successful. State = empty, Service = store ()");
		} else {
			System.out.println("Testcase-9 Fails. State = empty, Service = store ()");
		}

	}
}

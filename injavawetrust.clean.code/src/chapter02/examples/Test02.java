package chapter02.examples;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

	// Choosing names that reveal intent can make it much easier to understand and
	// change code.
	// What is the purpose of this code?

	private List<int[]> theList;

	public List<int[]> getThem() {
		List<int[]> list1 = new ArrayList<int[]>();
		for (int[] x : theList)
			if (x[0] == 4)
				list1.add(x);
		return list1;
	}

	// The problem isn’t the simplicity of the code but the implicity of the code

	// 1. What kinds of things are in theList?
	// 2. What is the significance of the zeroth subscript of an item in theList?
	// 3. What is the significance of the value 4?
	// 4. How would I use the list being returned?
}

package chapter02.examples;

// ##### Avoid Disinformation #####
public class Test05 {

	private static final int O = 0;
	private static int l;

	public static void main(String[] args) {

		// A truly awful example of disinformative names would be the use of lower-case
		// L or uppercase O as variable names, especially in combination
		@SuppressWarnings("unused")
		int a = l;

		if (O == l)
			a = 1;
		else
			l = 01;
	}
}

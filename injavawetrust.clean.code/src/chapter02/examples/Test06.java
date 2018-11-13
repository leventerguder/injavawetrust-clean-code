package chapter02.examples;

// ##### Make Meaningful Distinctions #####
public class Test06 {

	// Number-series naming (a1, a2, .. aN) is the opposite of intentional naming.
	// Such names are not disinformative they are noninformative; they provide no
	// clue to the author’s intention.
	public static void copyChars(char a1[], char a2[]) {
		for (int i = 0; i < a1.length; i++) {
			a2[i] = a1[i];
		}
	}
}

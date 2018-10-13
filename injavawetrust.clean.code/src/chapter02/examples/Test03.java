package chapter02.examples;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	// Each cell on the board is represented by a simple array. We further find that
	// the zeroth subscript is the location of a status value and that a status
	// value of 4 means “flagged.” Just by giving these concepts names we can
	// improve the code considerably:

	private List<int[]> gameBoard;
	private final int FLAGGED = 4;
	private final int STATUS_VALUE = 0;

	public List<int[]> getFlaggedCells() {
		List<int[]> flaggedCells = new ArrayList<int[]>();
		for (int[] cell : gameBoard)
			if (cell[STATUS_VALUE] == FLAGGED)
				flaggedCells.add(cell);
		return flaggedCells;
	}

	// Notice that the simplicity of the code has not changed. It still has exactly
	// the same number of operators and constants, with exactly the same number of
	// nesting levels. But the code has become much more explicit.
}

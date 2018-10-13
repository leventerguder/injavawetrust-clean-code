package chapter02.examples;

import java.util.ArrayList;
import java.util.List;

public class Test04 {

	private List<Cell> gameBoard;

	public List<Cell> getFlaggedCells() {
		List<Cell> flaggedCells = new ArrayList<>();
		for (Cell cell : gameBoard)
			if (cell.isFlagged())
				flaggedCells.add(cell);
		return flaggedCells;
	}

	// We can go further and write a simple class for cells instead of using an
	// array of ints.

	// It can include an intention-revealing function (call it isFlagged) to hide
	// the magic numbers

	// With these simple name changes, it’s not difficult to understand what’s going
	// on. This is the power of choosing good names.
}

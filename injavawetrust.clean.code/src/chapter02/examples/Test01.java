package chapter02.examples;

public class Test01 {
	// Use Intention-Revealing Names

	// If a name requires a comment, then the name does not reveal its intent.
	int d; // elapsed time in days

	// We should choose a name that specifies what is being measured and the unit of
	// that measurement:
	int elapsedTimeInDays;
	int daysSinceCreation;
	int daysSinceModification;
	int fileAgeInDays;
}

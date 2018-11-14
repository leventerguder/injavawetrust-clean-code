package chapter02.examples;

// ##### Method Names #####
public class Complex {

	public Complex(double real) {

	}

	// When constructors are overloaded, use static factory methods with names that
	// describe the arguments.
	public static Complex fromRealNumber(double real) {
		return new Complex(real);
	}
}

package chapter02.examples;

// ##### Method Names #####
public class Employee {

	// Accessors, mutators, and predicates should be named for their value and
	// prefixed with get, set, and is according to the javabean standard
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

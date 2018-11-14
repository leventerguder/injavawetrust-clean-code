package chapter02.examples;

public class Test09 {

}

class Part {
	private String m_dsc; // The textual description

	void setName(String name) {
		m_dsc = name;
	}
}

class PartV2 {
	String description;

	void setDescription(String description) {
		this.description = description;
	}
}
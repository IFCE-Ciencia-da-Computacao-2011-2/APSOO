package adapter.object;

public class People {
	private String name;

	public People(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "People: " + this.name;
	}
}

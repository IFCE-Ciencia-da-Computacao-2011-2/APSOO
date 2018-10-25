package factory;

public abstract class Pizza {
	private String name;

	public Pizza(String name) {
		this.name = name;
	}
	
	public void prepare() {
		System.out.println("Prepare: " + name);
	}

	public void bake() {
		System.out.println("Bake: " + name);
	}

	public void cut() {
		System.out.println("Cut: " + name);
	}

	public void box() {
		System.out.println("Box: " + name);
	}
}

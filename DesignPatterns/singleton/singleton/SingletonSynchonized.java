package singleton;

public class SingletonSynchonized {
	private static SingletonSynchonized instance;
	
	private SingletonSynchonized() {}
	
	public static synchronized SingletonSynchonized getInstance() {
		if (instance == null)
			instance = new SingletonSynchonized();

		return instance;
	}
}

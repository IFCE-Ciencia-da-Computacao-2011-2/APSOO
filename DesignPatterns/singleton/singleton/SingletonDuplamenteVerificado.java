package singleton;

public class SingletonDuplamenteVerificado {
	private static SingletonDuplamenteVerificado instance;
	
	private SingletonDuplamenteVerificado() {}
	
	public static SingletonDuplamenteVerificado getInstance() {
		if (instance == null)
			synchronized (SingletonDuplamenteVerificado.class) {
				if (instance == null)
					instance = new SingletonDuplamenteVerificado();
			}

		return instance;
	}
}

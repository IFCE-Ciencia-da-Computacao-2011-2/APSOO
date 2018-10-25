package singleton;

public class SingletonNaInicializacao {
	private static SingletonNaInicializacao instance = new SingletonNaInicializacao();
	
	private SingletonNaInicializacao() {}
	
	public static SingletonNaInicializacao getInstance() {
		return instance;
	}
}

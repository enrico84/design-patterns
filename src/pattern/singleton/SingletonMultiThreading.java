package pattern.singleton;

/**
 * Singleton:: gestione multithreading e thread-safe
 */
public class SingletonMultiThreading {

    private volatile static SingletonMultiThreading instance; // con "volatile" la instance creata viene condivisa
							      // correttamente tra i vari threads

    private SingletonMultiThreading() {
    }

    public static SingletonMultiThreading getInstance() {
	if (instance == null) {
	    synchronized (SingletonMultiThreading.class) {
		if (instance == null) {
		    instance = new SingletonMultiThreading();
		}
	    }
	}
	return instance;
    }
}

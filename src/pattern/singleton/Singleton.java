package pattern.singleton;

/**
 * Il Singleton è un pattern di tipo Creazionale. Garantisce che per una classe
 * sia creata una ed una sola instanza, fornendo ad essa un unico punto di
 * accesso. Tale necessità può presentarsi in diverse occasioni: accesso ai
 * database, configurazioni, logging ecc.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getSingleton() {
	if (instance == null) {
	    instance = new Singleton();
	}

	return instance;
    }

}

package creazionali.factory;

/**
 * 
 * Il pattern Factory consente di delegare la creazione degli oggetti ad una opportuna classe, liberando il client da questo lavoro.
 * E' un pattern Creazionale.
 * Il pattern si dimostra utile nel momento in cui non è noto a priori il tipo degli oggetti da creare e si vuole disaccoppiare 
 * il client dalla factory.
 * 
 * Qui sono create delle figure geometriche che sono scelte in base ad una selezione a runtime. Il client non conosce i dettagli implementativi.
 * 
 * Utilizzando come tipo di ritorno l'interfaccia, ci si libera da una particolare implementazione e si ha maggiore libertà d'azione.
 *
 */
public class AbstractFactoryUse {
    
    public void abstractStrategyUse() {
    AbstractFactory<Figura> factory = new FiguraFactory();
	Figura figura1 = factory.creaFigura(TipoFigura.CERCHIO);
	figura1.disegna();
	Figura figura2 = factory.creaFigura(TipoFigura.QUADRATO);
	figura2.disegna();
	
    }

}

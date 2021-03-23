package pattern.template.method;

/**
 * 
 * @author CAPONEE
 * 
 *         Template method - Pattern Comportamentali "Questo pattern permette di
 *         definire la struttura di un algoritmo lasciando alle sottoclassi il
 *         compito di implementarne alcuni passi come preferiscono. In questo
 *         modo si implementa la parte fissa di un algoritmo una volta sola e si
 *         lascia alle sottoclassi il compito di implementare il comportamento
 *         che può variare." cit. Wikipedia
 */
public abstract class TemplateClass {

    private void step1() {
	System.out.println("Step 1 dell'algoritmo");
    }

    private void step2() {
	System.out.println("Step 2 dell'algoritmo");
    }

    protected abstract void step3();

    private void step4() {
	System.out.println("Step 4 dell'algoritmo");
    }

    public final void algoritmo() {
	step1();
	step2();
	step3();
	step4();
    }

}

package pattern.template.method;

public class MainClass {

    public static void main(String[] args) {

	TemplateClass c1 = new ConcreteClass1();
	TemplateClass c2 = new ConcreteClass2();
	TemplateClass c3 = new ConcreteClass3();

	System.out.println("*** DESIGN PATTERN:: TEMPLATE METHOD ***");
	c1.algoritmo();
	System.out.println("=========================================");

	c2.algoritmo();
	System.out.println("=========================================");

	c3.algoritmo();
    }

}

package creazionali.factory;

public class FiguraFactory implements AbstractFactory<Figura>{
    
   @Override 
   public Figura creaFigura(TipoFigura figura) {
       
       switch(figura) {
       case CERCHIO:
	   return new Cerchio();
	   
       case QUADRATO: 
	   return new Quadrato();
	   
       case RETTANGOLO:
	   return new Rettangolo();
	   
	default:
	    return null;
       }
       
   }

}

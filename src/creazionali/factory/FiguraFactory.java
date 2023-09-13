package pattern.factory;

public class FiguraFactory {
    
    private FiguraFactory() {
	
    }

   public static Figura creaFigura(TipoFigura figura) {
       
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

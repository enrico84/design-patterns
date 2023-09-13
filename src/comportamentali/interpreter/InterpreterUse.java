package comportamentali.interpreter;

public class InterpreterUse {

    public void interpreterUse() {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();

      System.out.println("Matteo is male? " + isMale.interpret("Matteo"));
      System.out.println("Irene is a married women? " + isMarriedWoman.interpret("moglie Irene"));
    }

   public Expression getMaleExpression(){
      Expression giuseppe = new TerminalExpression("Giuseppe");
      Expression matteo = new TerminalExpression("Matteo");
      return new OrExpression(giuseppe, matteo);		
   }

   public Expression getMarriedWomanExpression(){
      Expression irene = new TerminalExpression("Irene");
      Expression married = new TerminalExpression("moglie");
      return new AndExpression(irene, married);		
   }
}

package comportamentali.templateMethod;

public class TemplateUse {
    
    public void templateUse() {
      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();
    }
}

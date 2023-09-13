package comportamentali.visitor;

public class VisitorUse {
    
    public void visitorUse() {
      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
    }
}

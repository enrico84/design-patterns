package comportamentali.mediator;

public class Button {
    private Mediator mediator;
    
    public Button() {
        this.mediator = new Mediator();
    }

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
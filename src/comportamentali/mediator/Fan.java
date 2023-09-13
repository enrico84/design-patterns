package comportamentali.mediator;

public class Fan {    
    private Mediator mediator;
    private boolean isOn = false;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public Fan() {
        this.mediator = new Mediator();
        this.isOn = false;
    }
    public Fan(Mediator mediator, boolean isOn) {
        this.mediator = mediator;
        this.isOn = isOn;
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }
}
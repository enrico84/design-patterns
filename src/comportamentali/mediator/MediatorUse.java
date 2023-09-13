package comportamentali.mediator;

public class MediatorUse {

    public void mediatorUse() {
        Button button = new Button();
        Fan fan = new Fan();
        PowerSupplier powerSupplier = new PowerSupplier();
        Mediator mediator = new Mediator(button, fan, powerSupplier);
        button.setMediator(mediator);
        fan.setMediator(mediator);

        System.out.println("Premo il pulsante, adesso sarà true");
        button.press();

        System.out.println(fan.isOn());

        System.out.println("Premo il pulsante, adesso sarà false");
        button.press();
        System.out.println(fan.isOn());
    }
}

import comportamentali.command.CommandUse;
import comportamentali.interpreter.InterpreterUse;
import comportamentali.iterator.IteratorUse;
import comportamentali.mediator.MediatorUse;
import comportamentali.memento.MementoUse;
import comportamentali.observer.ObserverUse;
import comportamentali.state.StateUse;
import comportamentali.strategy.StrategyUse;
import comportamentali.templateMethod.TemplateUse;
import comportamentali.visitor.VisitorUse;
import creazionali.factory.AbstractFactoryUse;
import creazionali.builder.BuilderExample;
import creazionali.factorymethod.CarFactory;
import creazionali.factorymethod.MotorVehicleFactory;
import creazionali.prototype.PinoTree;
import creazionali.prototype.Position;
import creazionali.prototype.Tree;
import strutturali.adapter.AdapterUse;
import strutturali.bridge.BridgeUse;
import strutturali.composite.CompositeUse;
import strutturali.decorator.DecoratorUse;
import strutturali.proxy.ProxyUse;

public class App {
    public static void main(String[] args) throws Exception {
    	//useAbstractFactory();
    	//useBuilder();
    	//useFactoryMethod();
    	usePrototype();
    }
    
    //Creazionali
    public static void useAbstractFactory() {
    	AbstractFactoryUse abstractFactoryUse = new AbstractFactoryUse();
    	abstractFactoryUse.abstractStrategyUse();
    }
    
    public static void useBuilder() {
    	BuilderExample builderExample = new BuilderExample();
    	builderExample.builderUse();
    }
    
    public static void useFactoryMethod() {
    	MotorVehicleFactory motorFactory = new CarFactory();
    	motorFactory.create();
    }
    
    public static void usePrototype() {
    	Tree firstPinoTree = new PinoTree("6", "3");
    	firstPinoTree.setPosition(new Position("12,32", "32,54"));
    	System.out.println("First PinoTree: \n" +firstPinoTree);
    	Tree secondPinoTree = firstPinoTree.copy();
    	secondPinoTree.setPosition(new Position("11,68", "30,01"));
    	System.out.println("Second PinoTree is a copy of first but different position: \n" +secondPinoTree);
    }

    //Comportamentali
    public static void useVisitor() {
        VisitorUse visitorUse = new VisitorUse();
        visitorUse.visitorUse();
    }


    public static void useTemplate() {
        TemplateUse templateUse = new TemplateUse();
        templateUse.templateUse();
    }

    public static void useStrategy() {
        StrategyUse strategyUse = new StrategyUse();
        strategyUse.strategyUse();
    }

    public static void useState() {
        StateUse stateUse = new StateUse();
        stateUse.stateUse();
    }


    public static void useObserver() {
        ObserverUse observerUse = new ObserverUse();
        observerUse.observerUse();
    }

    public static void useMemento() {
        MementoUse mementoUse = new MementoUse();
        mementoUse.mementoUse();
    }

    public static void useMediator() {
        MediatorUse mediatorUse = new MediatorUse();
        mediatorUse.mediatorUse();
    }

    public static void useIterator() {
        IteratorUse iteratorUse = new IteratorUse();
        iteratorUse.iteratorUse();

    }

    public static void useInterpreter() {
        InterpreterUse interpreterUse = new InterpreterUse();
        interpreterUse.interpreterUse();
    }

    public static void useCommand() {
        CommandUse commandUse = new CommandUse();
        commandUse.commandUse();
    }

    //Strutturali
    public static void useAdapter() {
        AdapterUse adapterUse = new AdapterUse();
        adapterUse.useAdapter();
    }

    public static void useBridge() {
        BridgeUse bridgeUse = new BridgeUse();
        System.out.println(bridgeUse.bridgeUse().draw());
    }

    public static void useComposite() {
        CompositeUse compositeUse = new CompositeUse();
        compositeUse.compositeUse();
    }

    public static void useDecorator() {
        DecoratorUse decoratorUse = new DecoratorUse();
        decoratorUse.decoratorUse();
    }

    public static void useProxy() {
        ProxyUse proxyUse = new ProxyUse();
        proxyUse.proxyUse();
    }
}

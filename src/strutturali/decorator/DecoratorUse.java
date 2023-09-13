package strutturali.decorator;

public class DecoratorUse {

    public void decoratorUse() {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());

        System.out.println("Tree 1: " + tree1.decorate());

        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));

        System.out.println("Tree 2 " + tree2.decorate());
    }
}

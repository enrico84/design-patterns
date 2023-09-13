package strutturali.proxy;

public class ProxyUse {

    public void proxyUse() {

        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}

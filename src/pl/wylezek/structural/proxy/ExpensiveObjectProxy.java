package pl.wylezek.structural.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {

    private static ExpensiveObject object;

    @Override
    public void process() {
        if (object == null)
            object = new ExpensiveObjectProxy();
        object.process();
    }
}

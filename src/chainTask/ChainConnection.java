package chainTask;

/**
 * Created by Dim on 02.04.2016.
 */
public class ChainConnection {
    private ChainElement a;
    private ChainElement b;

    public ChainConnection(ChainElement a, ChainElement b) {
        this.a = a;
        this.b = b;
        a.addConnected(b);
        b.addConnected(a);
    }

    public ChainElement getA() {
        return a;
    }

    public ChainElement getB() {
        return b;
    }

    @Override
    public String toString() {
        return "{" + a + "," + b + "}";
    }
}

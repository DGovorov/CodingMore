package chainTask;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dim on 01.04.2016.
 */
public class Chain {

    private List<ChainElement> elements = new LinkedList<>();
    private List<ChainConnection> connections = new LinkedList<>();

    public void addElement(ChainElement element, ChainConnection... connections) {
        for (ChainConnection c : connections) {
            this.connections.add(c);
        }
        elements.add(element);
    }

    public void removeElement(ChainElement element) {
        List<ChainConnection> toRemove = new LinkedList<>();

        for (ChainConnection c : connections) {
            if (c.getA().equals(element) || c.getB().equals(element)) {
                toRemove.add(c);
            }
        }
        for (ChainConnection t : toRemove) {
            t.getB().removeConnected(t.getA());
            t.getA().removeConnected(t.getB());
            connections.remove(t);
        }
        elements.remove(element);
    }

    @Override
    public String toString() {
        return "Chain{" +
                "elements=" + elements +
                ", connections=" + connections +
                '}';
    }
}

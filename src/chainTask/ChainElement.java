package chainTask;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dim on 01.04.2016.
 */
public class ChainElement {

    private int number;
    private List<ChainElement> connected = new LinkedList<>();

    public ChainElement(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void addConnected(ChainElement element) {
        connected.add(element);
    }

    public void removeConnected(ChainElement element) {
        connected.remove(element);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChainElement that = (ChainElement) o;

        if (number != that.number) return false;
        return connected != null ? connected.equals(that.connected) : that.connected == null;

    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (connected != null ? connected.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "#" + number;
    }
}

package chainTask;

import java.util.Iterator;

/**
 * Created by Dim on 03.04.2016.
 */
public class ChainIterator implements Iterator {

    private Chain chain;

    public ChainIterator(Chain chain){
        this.chain = chain;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}

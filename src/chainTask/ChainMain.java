package chainTask;

/**
 * Created by Dim on 02.04.2016.
 */
public class ChainMain {
    public static void main(String[] args) {

        Chain chain = new Chain();
        ChainElement first = new ChainElement(1);
        ChainElement second = new ChainElement(2);
        ChainElement third = new ChainElement(3);
        ChainElement fourth = new ChainElement(4);
        ChainElement fifth = new ChainElement(5);
        ChainElement sixth = new ChainElement(6);

        /*for (int i = 1; i <= 6; i++) {
            chain.addElement(new ChainElement(i));
        }*/

        chain.addElement(first);
        chain.addElement(second, new ChainConnection(first, second));
        chain.addElement(third, new ChainConnection(second, third));
        chain.addElement(fourth, new ChainConnection(third, fourth));
        chain.addElement(fifth, new ChainConnection(fourth, fifth));
        chain.addElement(sixth, new ChainConnection(fifth, sixth), new ChainConnection(sixth, fourth));

        System.out.println("Before remove: " + chain);

        chain.removeElement(second);
        chain.removeElement(fourth);
        chain.removeElement(fifth);
        System.out.println("After remove: " + chain);

        // WARNING: Exeption when ChainElement.toString() contains connected list;
    }
}

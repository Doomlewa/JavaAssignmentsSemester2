package ArithmeticTable;

/**
 * A generic interface for displayers.
 * @author Matt
 */
public interface Displayer {

    /**
     * The interface method that all table displays come from.
     * @param table the table to be displayed
     */
    public void displayTable(final Table table);
}

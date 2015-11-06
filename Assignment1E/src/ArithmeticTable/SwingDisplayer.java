package ArithmeticTable;

import javax.swing.JFrame;
/**
 * Class that displays any table as a Swing-based GUI.
 * @author Matt
 */
public class SwingDisplayer implements Displayer {

    /**
     * The method that displays table GUI
     * @param table the table being displayed.
     */
    @Override
    public void displayTable(final Table table) {
        final DisplayerFrame frame;

        frame = new DisplayerFrame();
        frame.init(table);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

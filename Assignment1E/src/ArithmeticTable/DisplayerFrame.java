package ArithmeticTable;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class DisplayerFrame
        extends JFrame {

    public void init(final Table table) {
        setTitle(table.getDescription() + "(" + table.getStart() + ", " 
                + (table.getSize() + table.getStart() - 1) + ")");
        setLayout(new GridLayout(table.getSize() + 1,
                table.getSize() + 1));

        add(new JButton(table.getDescription()));

        for (int col = 0; col < table.getSize(); col++) {
            add(new JButton(Integer.toString(table.getStart() + col)));
        }

        for (int row = 0; row < table.getSize(); row++) {
            add(new JButton(Integer.toString(table.getStart() + row)));

            for (int col = 0; col < table.getSize(); col++) {
                add(new JButton(Float.toString(table.getValueAt(row, col))));
            }
        }
    }
}

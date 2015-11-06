package ArithmeticTable;

/**
 * Super class for the creation and display of tables. Contains Elements
 * that are common between all Arithmetic Tables
 * @author Matt
 */
    class Table {
    //The variable containing the start location for the table
    private final int begin;
    //The variable containing the end location for the table
    private final int end;
    //the variable containing the size of the table.
    private final int range;
    //The calulator for table values.
    private final Calculator doStuff;
    //The array to store values
    private final float[][] values;
    
    /**
     * Constructor for a general table.
     * @param start the starting value for the tables range
     * @param stop the last value contained within the tables range
     * @param calc the appropriate calculator for the table
     */
    protected Table(final int start, final int stop, final Calculator calc)
    {
        begin = start;
        end =  stop;
        doStuff = calc;
        range =(end - begin) + 1 ;
        values = new float[range][range];
    }
    
    /**
     * Method that returns the start of the tables range
     * @return the lowest point of the range.
     */
    public int getStart()
    {
        return begin;
    }
    
    /**
     * Method that returns the end of the tables range.
     * @return the last value of the tables range.
     */
    public int getStop()
    {
        return end;
    }
    /**
     * Method that returns the size of the tables range.
     * @return size of table
     */
    public int getSize()
    {
        return range;
    }
    /**
     * Method that displays the type of table being created.
     * @return Type of table
     */
    public String getDescription()
    {
        return doStuff.getDescription();
    }
    
    /**
     * Method to retrieve the value from a specific cell in the table.
     * @param row the row the cell is in
     * @param column the column the cell is in
     * @return the value within the cell
     */
    public float getValueAt(final int row, final int column)
    {
        float result;
        result = values[row][column];
        return result;
    }
    
    /**
     * Method for calculation and storage of values in table
     */
    public void makeTable()
    {
        for (int i = 0; i < range; i++)
        {
            for (int j = 0; j<range; j++)
            {
                values[i][j] = doStuff.calcValue((i+begin), (j+begin));
            }
        }
    }
}

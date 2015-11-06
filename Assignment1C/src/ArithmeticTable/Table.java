package ArithmeticTable;

/**
 * Super class for the creation and display of tables. Contains Elements
 * that are common between all Arithmetic Tables
 * @author Matt
 */
    abstract class Table {
    //The variable containing the start location for the table
    public final int begin;
    //The variable containing the end location for the table
    public final int end;
    //The size of the table to be created
    public final int range;
    //The storage for the table values
    public final float[][] table;
    //Storgae of table type
    public final String type;
    
    /**
     * Constructor for a general table.
     * @param start the starting value for the tables range
     * @param stop the last value contained within the tables range
     * @param t the type of table being generated, stored for record.
     */
    protected Table(final int start, final int stop, final String t)
    {
        begin = start;
        end =  stop;
        range = (end-start)+1;
        table = new float[range][range];
        type = t;
    }
    
    /**
     * Empty method for creating tables. Filled in by child classes.
     */
    protected abstract void createTable();
  
    
     /**
     * General Method for the printing of the table
     */
    protected void display()
    {
        //variable determining current row of 2-d array.
        int row = 0;
         //section pertaining to first line of definitions
        System.out.printf("%3s",type);
        System.out.printf("%3s", "|");
        for(int i = begin;i<=end;i++)
        {
           System.out.printf("%5d",i); 
        }
        //Section pertaining to seperator
        System.out.printf("\n-----|");
        
        for(int i= begin;i<=end;i++)
        {
            System.out.printf("-----");
            
        }
        //Section pertaining to row labels
        for(int i= begin;i<=end;i++)
        {
            System.out.printf("\n");
            System.out.printf("%3d",i);
            System.out.printf("%3s","|");
            //section pertaining to table content
            for (int j=0;j<(range);j++)
            {
                System.out.printf("%5.0f",table[row][j]);
            }
            row++;
        }
        //new line for readability
        System.out.print("\n"); }
}

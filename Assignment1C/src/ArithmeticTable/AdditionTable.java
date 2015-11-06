package ArithmeticTable;

/**
 * Class for the generation and display of addition tables.
 * @author Matt Goerwell
 */
public class AdditionTable extends Table {
 
    
   /**
    * Equivalent constructor to the table class, enables proper data
    * transfer between child call and parent
    * @param start the lowest value for the table 
    * @param stop  The last value the table goes up to.
    * @param t     The type of table for reference and display
    */
    public AdditionTable(int start, int stop, String t)
    {
        super(start, stop, t);
    }
    
    /**
     * Method for display in the event reference is of type Multiplication Table
     */
    @Override
    public void display()
    {
        super.display();
    }
    
    /**
     * Method for the creation of addition tables
     */
    @Override
    public void createTable()
    {
        //Horizontal alignment
         for(int i=0;i<range;i++)
          {
              //Vertical Alignment
              for(int j=0;j<range;j++)
              {
                  //Calculation of table values.
                  table[i][j] = (i+begin)+(j+begin);
              }
          }
    }
    
}

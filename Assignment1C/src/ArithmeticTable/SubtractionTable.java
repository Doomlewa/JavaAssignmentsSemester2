package ArithmeticTable;

/**
 * Class for the generation and display of subtraction tables.
 * @author Matt Goerwell
 */
public class SubtractionTable extends Table {
    /**
     * 
     * Equivalent constructor to the table class, enables proper data
     * transfer between child call and parent abstract class.
     * @param start the lowest value for the table 
     * @param stop  The last value the table goes up to.
     * @param t     The type of table for reference and display
     */
    public SubtractionTable(int start, int stop, String t)
    {
        super(start, stop, t);
    }
         
    /**
     * Method for the printing of the table in event of direct call
     */
    @Override
    protected void display()
    {
        super.display();
    }
    /**
     * The method that generates the values stored in a subtraction table
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
                  table[i][j] = (j+begin)-(i+begin);
              }
          }
    }
}

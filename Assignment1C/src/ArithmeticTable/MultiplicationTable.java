package ArithmeticTable;
 
/**
 * The class for the generation and display of multiplication tables.
 * @author Matt Goerwell
 */
public class MultiplicationTable extends Table {

    /**
     * Equivalent constructor to the table class, enables proper data
     * transfer between child call and parent
     * @param start Lowest Value in the range.
     * @param stop  Highest Value in the range.
     * @param t     Type of table for reference and display.
     */
    public MultiplicationTable(int start, int stop, String t) {
        super(start, stop, t);
    }
    
    /**
     * Method for display in the event reference is of type Multiplication Table
     */
    public void display()
    {
        super.display();
    }
 
    /**
    Method for the creation of the table.
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
                  //Calcution of table values.
                  table[i][j] = (i+begin)*(j+begin);
              }
          }
    }
}

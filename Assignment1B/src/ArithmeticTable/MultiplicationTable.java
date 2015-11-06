package ArithmeticTable;

/**
 * The class for the generation and display of multiplication tables.
 * @author Matt Goerwell
 */
public class MultiplicationTable {
    //The variable containing the start location for the table
    private final int begin;
    //The variable containing the end location for the table
    private final int stop;
    //The size of the table to be created
    private final int range;
    //The storage for the table values
    private final float[][] table;
   
    /**
     * Constructor for multiplication tables.
     * @param start The initial value for calculations.
     * @param end   The last value for calculations.
     */
    public MultiplicationTable(int start, int end)
    {
        begin = start;
        stop =  end;
        range = (end-start)+1;
        table = new float[range][range];
        
    }
  
    /**
     * Method for the printing of the table
     */
    public void display()
    {
       
        //variable determining current row of 2-d array.
        int row = 0;
         //section pertaining to first line of definitions
        System.out.printf("*    |");
        for(int i = begin;i<=stop;i++)
        {
           System.out.printf("%5d",i); 
        }
        //Section pertaining to seperator
        System.out.printf("\n-----|");
        
        for(int i= begin;i<=stop;i++)
        {
            System.out.printf("-----");
            
        }
        //Section pertaining to row labels
        for(int i= begin;i<=stop;i++)
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
        System.out.print("\n"); 
    }
    /**
    Method for the creation of the table.
    */
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

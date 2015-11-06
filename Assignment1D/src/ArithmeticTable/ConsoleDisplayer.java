package ArithmeticTable;

/**
 * This class displays a table of any type.
 * @author Matt
 */
public class ConsoleDisplayer {
    // The type of table
    private String type;
    // the start of the range for the table
    private int begin;
    // the end of the range for the table
    private int end;
    // the length of the range of the table
    private int range;
    
 
    /**
     * Method that displays values of the table for end users.
     * @param table the table being displayed.
     */
    public void displayTable (Table table) 
   {
       /*
            Block relating to gathering parameters for the table.
       */
        type  = table.getDescription();
        begin = table.getStart();
        end   = table.getStop();
        range = (end-begin);
         //section pertaining to first line of definitions
        System.out.printf("%3s",type);
        System.out.printf("%3s", "|");
        for(int i = begin;i<=end;i++)
        {
           System.out.printf("%7d",i); 
        }
        //Section pertaining to seperator
        System.out.printf("\n-----|");
        
        for(int i= begin;i<=end;i++)
        {
            System.out.printf("-------");
            
        }
        //Section pertaining to row labels
        for(int i= 0;i<=range;i++)
        {
            System.out.printf("\n");
            System.out.printf("%3d",i+begin);
            System.out.printf("%3s","|");
            //section pertaining to table content
            for (int j=0;j<=(range);j++)
            {
                float result = table.getValueAt(i, j);
                System.out.printf("%7.2f",result);
            }
        }
        //new line for readability
        System.out.print("\n"); 
   }
}

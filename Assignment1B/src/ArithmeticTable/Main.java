package ArithmeticTable;
/**
 * The driver class for table generation. It reads in arguments from the
 * command line and uses them to determine the type, start and end points of the
 * table. It also displays the results indirectly.
 * @author Matt
 */
public class Main
{
    //Method for getting the command line arguments and applying them.
    public static void main(final String[] argv)
    {
        final TableType type;
        final int       start;
        final int       stop;
        
        if(argv.length != 3)
        {
            usage();
        }

        type  = getType(argv[0]);
        start = getNumber(argv[1]);
        stop  = getNumber(argv[2]);
        
        displayTable(type, start, stop);
    }
    
    /**
     * Determines the type of table based on whether a + or * was 
     * entered. Returns an error if neither was.
     * @param str the user entered string for type.
     * @return the type of table
     */
    
    public static TableType getType(final String str)
    {
        final TableType type;
        
        if(str.equals("+"))
        {
            type = TableType.ADD;
        }
        else if(str.equals("*"))            
        {
            type = TableType.MULT;
        }
        else
        {
            usage();
            type = null;
        }
        
        return (type);
    }
    
    /**
     * Method that determines the number a user has entered. 
     * Returns an error if it is greater than 100 or less than 1.
     * @param str the user-inputted string containing the number
     * @return the integer value entered
     */
    public static int getNumber(final String str)
    {
        int val;
        
        try
        {
            val = Integer.parseInt(str);
            
            if(val < 1 || val > 100)
            {
                usage();
            }
        }
        catch(NumberFormatException ex)
        {
            usage();
            val = 0;
        }
        
        return (val);
    }
    
    /**
     * Method that creates and displays the table based on user input.
     * @param type The type of table to be made
     * @param start The value the table begins from
     * @param stop The value the table ends at.
     */
    public static void displayTable(final TableType type,
                                    final int start,
                                    final int stop)
    {
        //Switch to determine table type. Returns an error if the user manged
        // to somehow get this far without a proper one.
       switch(type)
       {
           //Case for addition tables
           case ADD:
               AdditionTable a = new AdditionTable(start, stop);
               a.createTable();
               a.display();
               break;
           //Case for Multiplication Tables    
           case MULT:
               MultiplicationTable m = new MultiplicationTable(start, stop);
               m.createTable();
               m.display();
               break;
           //Default Case    
           default:  
               usage();
               break;
       }
    }    
    
    /**
     * Standard error message for improper user input.
     */
    public static void usage()
    {
        System.err.println("Usage: Main <type> <start> <stop>");
        System.err.println("\tWhere <type> is one of +, \"*\"");
        System.err.println("\tand <start> is between 1 and 100");
        System.err.println("\tand <stop> is between 1 and 100");
        System.err.println("\tand start < stop");
        System.exit(1);
    }            
}

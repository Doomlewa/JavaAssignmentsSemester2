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
    //Also displays results indirectly
    public static void main(final String[] argv)
    {
        final TableType type;
        final int       start;
        final int       stop;
        final Table     t;
        
        if(argv.length != 3)
        {
            usage();
        }

        type  = getType(argv[0]);
        start = getNumber(argv[1]);
        stop  = getNumber(argv[2]);
        t     = getTable(type, start, stop);
        t.createTable();
        t.display();
    }
    
    /**
     * The method used to determine table type based on user's command
     * line arguments
     * @param str the users input in the type arguments slot of the command 
     * line
     * @return The type of table to be generated.
     */
    public static TableType getType(final String str)
    {
        final TableType type;
        
        if(str.equals("+"))
        {
            type = TableType.ADD;
        }
        else if(str.equals("-"))            
        {
            type = TableType.SUB;
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
     * Method for converting numbers in string format (as on the command
     * line) into usable integers.
     * @param str the number to be converted in string format
     * @return 
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
     * The method used to generate the appropriate table.
     * @param type the type of table to be generated.
     * @param start the initial starting point for the table.
     * @param stop the last value covered by the table.
     * @return the finished table of the desired type.
     */
    public static Table getTable(final TableType type,
                               final int start,
                               final int stop)
    { 
        final Table t;
        if (start > stop)
        {
            usage();
        }
        
        switch (type)
        {
            case MULT:
                t = new MultiplicationTable(start,stop,"*");
                break;
            case ADD:
                t = new AdditionTable(start,stop,"+");
                break;
            case SUB:
                t = new SubtractionTable(start,stop,"-");
                break;
            default:
                t = null;
                
        }
        return t;
    }    
    
    /**
     * Method for informing user they have made a mistake and 
     * re-iterating the proper usage of this program.
     */
    public static void usage()
    {
        System.err.println("Usage: Main <type> <start> <stop>");
        System.err.println("\tWhere <type> is one of +, \"*\" or -");
        System.err.println("\tand <start> is between 1 and 100");
        System.err.println("\tand <stop> is between 1 and 100");
        System.err.println("\tand start < stop");
        System.exit(1);
    }            
}

public class ArithmeticTable {
//Enum defining the types of tables available (addition or multiplication)
public enum TableType{
    MULT,ADD
}
// The variable contain the start value for calculations.
private int start;
// The variable contain the end value for calculations.
private int end;
// 2-d Array containing the calculated values for the table
private float[][] tables;
// Variable determining the type of table being displayed
private TableType tableType;


/*
    Provided method to ensure proper command line arguments. I have no idea how
    it works, as I have't really looked at it.
*/
public boolean argumentCheck(String[] args){
    if(args.length!=3){
      System.err.println("Usage: Main <type> <start> <stop>");
      System.err.println("\tWhere <type> is one of +, \"*\"");
      System.err.println("\tand <start> is between 1 and 100");
      System.err.println("\tand <stop> is between 1 and 100");
      System.err.println("\tand start < stop");
      return false;
    }        

    if(args[0].charAt(0) == '+')
      tableType = TableType.ADD;
    else
      tableType = TableType.MULT;
      int sta;
      int sto;

      try{
        sta = Integer.parseInt(args[1]);
        sto = Integer.parseInt(args[2]);
      }
      catch(NumberFormatException ex){
        System.err.println("Usage: Main <type> <start> <stop>");
        System.err.println("\tWhere <type> is one of +, -, \"*\", /");
        System.err.println("\tand <start> is between 1 and 100");
        System.err.println("\tand <stop> is between 1 and 100");
        System.err.println("\tand start < stop");
        return false;
      }

      if((sta < 1 || sta > 100)||((sto < 1 || sto > 100))){
        System.err.println("Usage: Main <type> <start> <stop>");
        System.err.println("\tWhere <type> is one of +, -, \"*\", /");
        System.err.println("\tand <start> is between 1 and 100");
        System.err.println("\tand <stop> is between 1 and 100");
        System.err.println("\tand start < stop");
        return false;
      }

      if(sta >= sto){
        System.err.println("Usage: Main <type> <start> <stop>");
        System.err.println("\tWhere <type> is one of +, -, \"*\", /");
        System.err.println("\tand <start> is between 1 and 100");
        System.err.println("\tand <stop> is between 1 and 100");
        System.err.println("\tand start < stop");
        return false;
      }
      
    start = sta;
    end = sto;
    return true;
  }

/*
    The method to create multiplication or addition tables.
    it uses nested for loops to fill in a 2d array.
*/
  public void createTable(int begin,int end, TableType tableType ) {
      //local variable determining the bounds of the 2-d array
      int length = (end-begin)+1;
      //2d array initialization
      tables = new float[length][length];
      
      //process for generating addition tables, to ensure proper placement of
      //values
      if (tableType == TableType.ADD)
      {
          for(int i=0;i<length;i++)
          {
              for(int j=0;j<length;j++)
              {
                  tables[i][j] = (i+start)+(j+start);
              }
          }
      }
      //process for generating multiplication tables, to ensure proper placement 
      //of values
      if (tableType == TableType.MULT)
      {
          for(int i=0;i<length;i++)
          {
              for(int j=0;j<length;j++)
              {
                  tables[i][j] = (i+start)*(j+start);
              }
          }
      }
      
  }
  
  /*
    Method to display contents of table. It uses formatting methods to ensure a
    consistant look.
  */
  public void printTable() {
      //variable determining current row of 2-d array.
      int row = 0;
      //This portion runs if the table is an addition table
      if (tableType == TableType.ADD)
      {
        //section pertaining to first line of definitions
        System.out.printf("+    |");
        for(int i = start;i<=end;i++)
        {
           System.out.printf("%5d",i); 
        }
        //Section pertaining to seperator
        System.out.printf("\n-----|");
        
        for(int i= start;i<=end;i++)
        {
            System.out.printf("-----");
            
        }
        //Section pertaining to row labels
        for(int i= start;i<=end;i++)
        {
            System.out.printf("\n");
            System.out.printf("%3d",i);
            System.out.printf("%3s","|");
            //section pertaining to table content
            for (int j=0;j<(end-start+1);j++)
            {
                System.out.printf("%5.0f",tables[row][j]);
            }
            row++;
        }
        //new line for readability
        System.out.print("\n");
      }
      
      //This section runs if the table is a multiplication table
      if (tableType == TableType.MULT)
      {
      //section pertaining to first line of definitions
      System.out.printf("*    |");
        for(int i = start;i<=end;i++)
        {
           System.out.printf("%5d",i); 
        }
        //Section pertaining to seperator
        System.out.printf("\n-----|");
        
        for(int i= start;i<=end;i++)
        {
            System.out.printf("-----");
            
        }
        //Section pertaining to row labels
        for(int i= start;i<=end;i++)
        {
            System.out.printf("\n");
            System.out.printf("%3d",i);
            System.out.printf("%3s","|");
            //section pertaining to table content
            for (int j=0;j<(end-start+1);j++)
            {
                System.out.printf("%5.0f",tables[row][j]);
            }
            row++;
        }
        System.out.print("\n");
      }
  }
  
  public static void main(String[] args){
    ArithmeticTable table = new ArithmeticTable();
    if (table.argumentCheck(args)){
      table.createTable(table.start, table.end, table.tableType);
      table.printTable();
    }
  }
}
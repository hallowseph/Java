package LABS;

/**
 *
 * @author josep
 */
public class Week1Lab {

  public static void main(String[] args) {
        diamond(6, 6);
    }
    public static void repeatlyPrint(int amount, String pattern) 
    {       
        if(amount>0)
        {
            // print a pattern once
            System.out.print(pattern);
            // recursively call the function itself
            repeatlyPrint(amount - 1, pattern);
        }      
}

public static void diamond(int totalHeight, int currentRow)
    {
        repeatlyPrint(currentRow-1, " ");//print spaces (outside of diamond)
        repeatlyPrint(totalHeight-currentRow, "* ");//print asterisks and spaces
        System.out.println();
        if(currentRow>1)
        {
            diamond(totalHeight, currentRow-1);
        }
        repeatlyPrint(currentRow-1, " ");//print spaces
        repeatlyPrint(totalHeight-currentRow, "* ");//print asterisks and spaces
        System.out.println();
    }


}

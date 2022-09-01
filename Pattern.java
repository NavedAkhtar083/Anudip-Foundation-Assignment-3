package anudipfoundation;

public class Pattern {
    
    public static void main(String[] args) 
    {
        int n =5;
        for (int i=1; i<=n; i++)    // Print  rows of stars *
        {
        	 
            for (int j=1; j<=i; j++)    // Printing Column of Stars *
            {
                if( j == 1 || j == 0 || i == n)   //condition check
                {                              
                    System.out.print("*");   //print *
                }
               else
                {
                    System.out.print(" ");   //print space
                }
            }
            System.out.println(); //for going to the next line 
        }  
    }  
}

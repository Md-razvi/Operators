package Operators;
import java.util.Scanner;
public class Problem4 
{
    public static void main(String[] args)
    {
    try(Scanner nb=new Scanner(System.in))
    {
        System.out.println("Enter the  two numbes:");
        int a=nb.nextInt();
        int b=nb.nextInt();
        
        if(a==b)
        {
            System.out.println("Yes they are same numbers");
        }
        else
        {
            System.out.println("No They are false");
        }
    }
    }
    
}

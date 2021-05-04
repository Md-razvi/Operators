package Operators;
//Logical Operator Program
/**And &&
 * OR  ||
 * Not !
 */
public class Problem5 {
    static void AndFunct(int a)
    {
    if(a%2==0&&a%3==0)
    {
        System.out.println("a is present in both 2 and 3 table");
    }
    else
    {
        System.out.println("It is either in 2 or in 3");
    }
    }
    static void OrFunc(int a)
    {   
    if(a%2==0||a%5==0)
        {   
            System.out.println(a+" It belongs 2 or 5");
        }
    else
        {
            System.out.println(a+" It does not belongs 2 or 5");
        }

    }
    static void NotFunc(int a)
    {
        if (!(a%2==0))
        {
            System.out.println(a+" is an odd number");
        }
        else
        {
            System.out.println(a+" is an even number");

        }

    }

    public static void main(String[] args) 
    {
        // And Condition requires both condition to be true
        AndFunct(23);
        OrFunc(16);
        NotFunc(4);

    }
}

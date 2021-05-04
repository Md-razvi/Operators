package Operators;
// Relational operators
public class Problem6 {
    public static void main(String[] args) 
    {   
        int a=34,b=56;
        System.out.println(a>b);// Checks whether a is greater than b which is false
        System.out.println(a<b);// Checks whether a is smaller than b which is true
        System.out.println(a==b);//Checks whether a is equal to b which is false
        System.out.println(a<=b);//Checks whether a is less than Or equal to b which is true since a<b it accepts any one condition of Or
        System.out.println(a>=b);//Checks whether a is greater than Or equal to b which is false since any one of the condition are not met
    }    
}

package Operators;

public class Problem2 
{
    public static void main(String[] args)
    {
        //-- stands for decrement
        //++ stands for increment
        //
        int a=13, b=6;
        int c,d,e,f;
        c=a-(++b);// b gets pre increment
        d=(a++)+(b);// a gets post increment
        e=(--c)+10;
        f=10+(d--);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a);
        System.out.println(e);
        System.out.println(f);

    }
}

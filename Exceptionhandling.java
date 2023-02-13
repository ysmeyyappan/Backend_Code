import java.io.*;
import java.util.*;
public class Exceptionhandling
{
    void call1(int a,int b)
    {
        try 
        {
            int k=a/b;
        } 
        catch (FormatterClosedException e) 
        {
            System.out.println(e.getMessage());
        }
    }
    void call(int a,int b)
    {
        try 
        {
            call1(a,b);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Hello");
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try
        {
            int c=a/b;
        } 
        catch (Exception e) 
        {
            System.out.println(e.fillInStackTrace());
        }
        Exceptionhandling x=new Exceptionhandling();
        x.call(1,0);
    }
    
}
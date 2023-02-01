import java.util.*;
//Threading using Thread class
class multithreading extends Thread
{
    public void run()
    {
        try 
        {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        } 
        catch (Exception e) {
            System.out.println("Error occured");
        }
    }
}
//Threading using Runnable interface
class multithread implements Runnable
{
    public void run()
    {
        try 
        {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        } 
        catch (Exception e) {
            System.out.println("Error occured");
        }
    }
}
public class Threading  {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            multithreading x=new multithreading();
            x.start();
            Thread x1=new Thread(new multithread());
            x1.start();
        }
    }
}

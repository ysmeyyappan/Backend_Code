import java.util.*;
import java.io.*;
public class Collections {
    public static void main(String[] args) {
        //vectors
        Vector<Integer>z=new Vector<Integer>();
        z.add(0);
        z.add(1);
        //z.add(1, 3);
        //z.remove(0);
        for(int x:z)
        {
            System.out.println(x);
        }
        //List
        List<Integer>m=new ArrayList<>();
        m.add(0);
        m.add(1);
        //m.remove(0);
        for(int x:m)
        {
            System.out.println(x);
        }
        //LinkedList
        LinkedList<Integer>l=new LinkedList<>();
        l.add(0);
        l.add(0, 5);
        l.remove(0);
        for(int x:l)
        {
            System.out.println(x);
        }
        //HashSet
        HashSet<Integer>hash=new HashSet<>();
        hash.add(5);
        hash.add(7);
        hash.add(6);
        for(int x:hash)
        {
            System.out.println(x);
        }
        //HashMap
        HashMap<Integer,Integer>hash1=new HashMap<>();
        hash1.put(9,0);
        hash1.put(8,0);
        hash1.put(0,0);
        for(Map.Entry<Integer,Integer>x:hash1.entrySet())
        {
            System.out.println(x.getKey()+" "+x.getValue());
        }
        //TreeMap
        TreeMap<Integer,Integer>hash2=new TreeMap<>();
        hash2.put(5,0);
        hash2.put(6,0);
        hash2.put(4,0);
        for(Map.Entry<Integer,Integer>x:hash2.entrySet())
        {
            System.out.println(x.getKey()+" "+x.getValue());
        }
        //TreeSet
        TreeSet<Integer>hash3=new TreeSet<>();
        hash3.add(5);
        hash3.add(6);
        hash3.add(4);
        for(int x:hash3)
        {
            System.out.println(x);
        }
        //LinkedHashSet
        LinkedHashSet<Integer>hash4=new LinkedHashSet<>();
        hash4.add(9);
        hash4.add(8);
        for(int x:hash4)
        {
            System.out.println(x);
        }
        //LinkedHashMap
        LinkedHashMap<Integer,Integer>hash5=new LinkedHashMap<>();
        hash5.put(9,7);
        hash5.put(8,2);
        for(Map.Entry<Integer,Integer>x:hash5.entrySet())
        {
            System.out.println(x.getKey()+" "+x.getValue());
        }
        //Stack
        Stack<Integer>stack=new Stack<>();
        stack.push(0);
        stack.push(5);
        while(stack.empty()==false)
        {
            System.out.println(stack.peek());
            stack.pop();
        }
        //Queue
        Queue<Integer>p=new PriorityQueue<Integer>();
        p.add(0);
        p.add(5);
        while(p.size()>0)
        {
            System.out.println(p.peek());
            p.remove();
        }
    }
}

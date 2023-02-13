import java.util.*;

class inherit
{
    int a;
    inherit()
    {
        a=10;
    }
}
//Singleton
class Singleton
{
    static Singleton x=new Singleton();
    int x1=0;
    int x2=0;
    Singleton()
    {

    }
    Singleton func1()
    {
        x.x1=1;
        x.x2=2;
        return x;
    }
}
//Inheritance
class a
{
    int k1=0;
    a()
    {
        k1=5;
    }
}
class b extends a
{
    int k2=0;
    b()
    {
        k2=7;
    }
    void print()
    {
        System.out.println(k1);
        System.out.println(k2);
    }
}
//Abstract class
abstract class h
{
    int p=0;
    abstract void print();
    void say_hello()
    {
        System.out.println("Say Hello");
    }
} 
//Interfaces
interface interface1{
    int p1=50;
    public void print();
}
class d1 implements interface1
{
    @Override
    public void print()
    {
        System.out.println("hello");
    }
}
class d extends h
{
    void print()
    {
        System.out.println("Hello");
    }
}
class Oops
{
    public static void main(String[] args) 
    {
        System.out.println("Hello");
        inherit inherit1=new inherit();
        System.out.println(inherit1.a);
        //Singleton
        Singleton g=new Singleton();
        g=g.func1();
        System.out.println(g.x1);
        System.out.println(g.x2);
        //Single inheritance
        b b1=new b();
        b1.print();
        //Arrays
        int[]array={1,0,2,3,4};
        Arrays.sort(array);
        //reverse(array);
        //Arrays.sort(array,Collections.reverseOrder());
        //Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array Length: "+array.length);
        System.out.println("Array Elements are");
        for(int i:array)
        {
            System.out.print(i);
            System.out.print(" ");
         }
        System.out.println();
        System.out.println(array[0]);
        // Strings
        String h="meyyappan";
        for(int i=0;i<h.length();i++)
        {
            int o=h.charAt(i)-'a';
            System.out.print(o+" ");
            System.out.print(h.charAt(i));
            System.out.print(" ");
        }
        System.out.println();
        //Abstract class
        d m=new d();
        m.print();
        m.say_hello();
        System.out.println(m.p);
        d1 g1=new d1();
        g1.print();
        System.out.println(g1.p1);
        //Arraylist
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        Iterator it=list.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        //LinkedList
        LinkedList<Integer>llist=new LinkedList<Integer>();
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);
        llist.add(5);
        Iterator itr= llist.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        //Vector
        Vector<String>x=new Vector<String>();
        x.add("Dhoni");
        x.add("Kohli");
        x.add("Rohit");
        x.add("Raina");
        x.add("Jadeja");
        Iterator iter=x.iterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next()+" ");
        }
        System.out.println();
        //Stack
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Iterator iter1=stack.iterator();
        while(iter1.hasNext())
        {
            System.out.print(iter1.next()+" ");
        }
        System.out.println();
        //Priority_queue
        PriorityQueue<Integer>e=new PriorityQueue<Integer>();
        e.add(5);
        e.add(4);
        e.add(3);
        e.add(2);
        Iterator it2=e.iterator();
        while(it2.hasNext())
        {
            System.out.print(it2.next()+" ");
        }
        System.out.println();
        e.poll();
        System.out.println(e.peek());
        e.remove();
        Iterator it3=e.iterator();
        while(it3.hasNext())
        {
            System.out.print(it3.next()+" ");
        }
        System.out.println();
        Deque<Integer> deque=new ArrayDeque<Integer>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        Iterator itr4=deque.iterator();
        while(itr4.hasNext())
        {
            System.out.print(itr4.next()+" ");
        }
        System.out.println();
        HashSet<String>set=new HashSet<String>();
        set.add("hi");
        set.add("hello");
        set.add("hi");
        set.add("apple");
        Iterator itrr=set.iterator();
        while(itrr.hasNext())
        {
            System.out.print(itrr.next()+" ");
        }
        System.out.println();

        LinkedHashSet<String>set1=new LinkedHashSet<String>();
        set1.add("hi");
        set1.add("hello");
        set1.add("hi");
        set1.add("apple");
        Iterator itrr1=set1.iterator();
        while(itrr1.hasNext())
        {
            System.out.print(itrr1.next()+" ");
        }
        System.out.println();

        TreeSet<String>set2=new TreeSet<String>();
        set2.add("hi");
        set2.add("hello");
        set2.add("hi");
        set2.add("apple");
        Iterator itrr2=set2.iterator();
        while(itrr2.hasNext())
        {
            System.out.print(itrr2.next()+" ");
        }
        System.out.println();
    }
}
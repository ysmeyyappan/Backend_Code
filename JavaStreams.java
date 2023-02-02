import java.util.stream.Collectors;
import java.util.*;
class person
{
    String name;
    Integer age;
}
public class JavaStreams {
    public static void main(String[] args) {
        List<Integer>x=new ArrayList<Integer>();
        x.add(100);
        x.add(50);
        x.add(200);
        List<Integer>SORTED=x.stream().sorted().collect(Collectors.toList());
        System.out.println(SORTED);
        List<Integer>Square=x.stream().map(m->m*m).collect(Collectors.toList());
        System.out.println(Square);
        List<Integer>filtered=x.stream().filter(m->m>=100).collect(Collectors.toList());
        System.out.println(filtered);
        x.stream().forEach(y->System.out.print(y+" "));
        System.out.println();
        //Finding the largest number using the reduce method
        Optional<Integer> c=x.stream().reduce((y1, y2)->y1>y2?y1:y2);
        c.ifPresent(System.out::println);
        //Performing the same operations in a class
        person l=new person();
        l.name="Meyyappan";
        l.age=20;
        person l1=new person();
        l1.name="Aakash";
        l1.age=27;
        person l2=new person();
        l2.name="Suresh";
        l2.age=19;
        Vector<person>p=new Vector<person>();
        p.add(l);
        p.add(l1);
        p.add(l2);
        p.stream().filter(p1->p1.age>=20).sorted(Comparator.comparing(k->k.name)).collect(Collectors.toList()).forEach(w->System.out.println(w.name+" "+w.age));
    }
}

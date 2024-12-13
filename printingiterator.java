import java.util.*;
public class printingiterator{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("HELLO");
        a.add("HELLO");
        a.add("RISHITHA");
        a.add("RISHITHA");
        a.add("HOWRU");
        //printing using iterator
        Iterator itr= a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
    }
}  
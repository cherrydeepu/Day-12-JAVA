import java.util.*;
public class setInterface{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("HELLO");
        a.add("HELLO");
        a.add("RISHITHA");
        a.add("RISHITHA");
        a.add("HOWRU");
        System.out.println(a);
        a.remove("HOWRU");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}
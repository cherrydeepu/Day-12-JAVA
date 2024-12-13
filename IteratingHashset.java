import java.util.*;
public class IteratingHashset{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("HELLO");
        a.add("HELLO");
        a.add("RISHITHA");
        a.add("RISHITHA");
        a.add("HOWRU");
        //iterator
        for(String s:a){
            System.out.println(s+" ");
        }
    }
}
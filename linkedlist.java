import java.util.*;
public class linkedlist{
    public static void main(String args[]){
        LinkedList<String> a=new LinkedList<>();
        a.add("HELLO");
        a.add("RISHITHA");
        a.add("HOWRU");
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.clear();//clears all the data/elements
        System.out.println(a);
    }
}
import java.util.*;
public class Clone{
    public static void main(String args[]){
        //Accepting values into LinkedList
        LinkedList<Integer> a=new LinkedList<>();
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        for(int i=0;i<size;i++)
        {
            int sc=s.nextInt();
            a.addFirst(sc);
        }
         LinkedList<Integer> b=new LinkedList<>();
         b=(LinkedList)a.clone();
         System.out.println(b);   
    }
}
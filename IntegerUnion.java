import java.util.*;
public class IntegerUnion{
    public static void main(String args[]){
        int arr1[]={99,5,6,1,2,3};
        int arr2[]={1,2,3,4,5,6};
        Set<Integer> a=new HashSet();
        Set<Integer> b=new HashSet();
        for(int s1:arr1)
        a.add(s1);
        System.out.println(a);
        for(int s2:arr2)
        b.add(s2);
        System.out.println(b);
        Set<Integer> U=new HashSet<>a;
        U.addAll(b);
        System.out.println(U);
    }
}

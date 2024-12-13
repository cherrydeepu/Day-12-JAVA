import java.util.*;
public class AcceptingvaluesintoHS{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        HashSet<String> a=new HashSet<>();
        //accepting the values into hash set
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            String st=s.next();
            a.add(st);
        }
        System.out.println(a);
    }
}
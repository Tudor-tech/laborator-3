import java.util.Random;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List l = new ArrayList();

        for(int i = 0; i < 15; i++)
        {
            int random = (int)(Math.random()*100);
            l.add(random);
        }

        for(int i = 0; i < 15; i++){
            System.out.println(l.get(i));
        }

        HashSet <String> hashSet = new HashSet<String>();

        hashSet.add("TEST1");
        hashSet.add("TEST2");

        for(String s:hashSet){
            System.out.println(s);
        }
    }
}
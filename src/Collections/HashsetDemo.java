package Collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashsetDemo {
    public static void main(String[] args) {
        TreeSet<String> hs = new TreeSet<String>();
        hs.add("kishore");
        hs.add("kishore");
        hs.add("java");
        hs.add(".net");
        hs.add("java");

        for( Object s : hs){
            System.out.println(s);
        }
    }
}

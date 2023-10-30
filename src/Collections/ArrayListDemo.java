package Collections;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList a1 = new ArrayList<>();
        a1.add("kishore");
        a1.add(2);
        a1.add(4);
        a1.add("java");
        a1.add(new Integer(100));

        String st = (String) a1.get(4);
        System.out.println(st.toUpperCase());

        for(Object obj : a1){
            System.out.println(obj);
        }

        a1.remove("java");
        for(Object obj : a1){
            System.out.println(obj);
        }
        System.out.println(a1.indexOf(2));
    }
}

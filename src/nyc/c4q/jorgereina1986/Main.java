package nyc.c4q.jorgereina1986;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	// write your code here

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(3);
        list.add(5);
        list.add(99);
        list.add(9);
        list.add(19);
        list.add(91);
        list.add(2);
        list.add(39);

        ArrayList<Integer> list2 = new ArrayList<Integer>();



        System.out.println(LinearSearch.search(list, 19));



    }
}
